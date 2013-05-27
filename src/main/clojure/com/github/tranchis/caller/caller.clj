(ns com.github.tranchis.caller.Caller
  (require [clj-http.client :as client])
  (require [clojure.data.xml :as xml]
           [clojure.zip :as zip]))

(import com.ibm.wsdl.xml.WSDLReaderImpl
        javax.wsdl.Definition
        (org.w3c.dom Element NodeList)
        org.w3c.dom.ls.DOMImplementationLS
        com.sun.xml.xsom.parser.XSOMParser
        com.sun.xml.xsom.XSSchemaSet
        java.net.URL
        java.util.GregorianCalendar
        javax.xml.namespace.QName
        java.io.ByteArrayInputStream
        javax.xml.datatype.DatatypeFactory
        (com.sun.xml.xsom XSSimpleType XSComplexType)
        com.sun.xml.xsom.visitor.XSContentTypeVisitor)

(defn array-of [cname]
  (-> cname resolve .newInstance list into-array class .getName))

(gen-class
  :name com.github.tranchis.caller.Caller
  :methods [
            [callService [String #=(array-of Object) Class] Object]
           ])
  
(defn ^String -prueba [this ^String a]
  "prueba")

(def match-attributes)

(def map-types (agent {}))

(defn get-method-call [obj normal boolean]
  (try
    (clojure.lang.Reflector/invokeInstanceMethod obj normal (into-array (list)))
    (catch Exception iae
      (clojure.lang.Reflector/invokeInstanceMethod obj boolean (into-array (list))))))

(defn get-attribute-with-object [attr value]
  (let [name (.getName attr)
        type (.getType attr)
        methods (into [] (.getMethods (class value)))
        method-call (str "get" (clojure.string/upper-case (first name)) (.substring name 1))
        method-call-boolean (str "is" (clojure.string/upper-case (first name)) (.substring name 1))
        result (get-method-call value method-call method-call-boolean)]
    (if (instance? XSSimpleType type)
      [name result]
      [name (match-attributes type result)])))

(defn get-attributes [attrs value]
  (into [] (map #(get-attribute-with-object % value) attrs)))

(defn visit-schema [xsv]
  (.visit (:content-type (get @map-types xsv)) xsv))

(defn schema-visitor [content-type value]
  (let [xsv (reify
    com.sun.xml.xsom.visitor.XSVisitor
    (empty [this empty])
    (particle [this particle]
      (let [term (.getTerm particle)]
        (if (.isModelGroup term)
          (let [particles (.getChildren term)]
            (send map-types assoc this {:attrs (get-attributes (map #(.getTerm %) particles) value)})
            (await map-types))
          (throw (UnsupportedOperationException.)))))
    (simpleType [this simpleType])
    (complexType [this complexType]))]
    (send map-types assoc xsv {:content-type content-type :value value})
    (await map-types)
    xsv))

;(set! *warn-on-reflection* true)

(defn get-schema [^Definition d]
  (let [schema (-> (.getTypes d) .getExtensibilityElements first .getElement)
        xsd-dirty (-> schema .getOwnerDocument .getImplementation .createLSSerializer (.writeToString schema))
        xsd (clojure.string/replace xsd-dirty "<?xml version=\"1.0\" encoding=\"UTF-16\"?>" "")
        bais (ByteArrayInputStream. (.getBytes xsd))
        xsomp (XSOMParser.)]
    (.parse xsomp bais)
    (let [sch (.getResult xsomp)]
      sch)))

(defn get-operation [list-operations ^String name-operation]
  (first (filter #(= (clojure.string/lower-case name-operation) (clojure.string/lower-case (.getName %))) list-operations)))

(defn get-operations [^Definition d]
  (mapcat #(.getOperations (.getValue %)) (.getAllPortTypes d)))

(defn generate-soap-request [ns operation data]
  (xml/emit-str
    (xml/sexp-as-element
      [:S:Envelope {:xmlns:S "http://schemas.xmlsoap.org/soap/envelope/"}
       [:S:Header]
       [:S:Body
        [(keyword (str "ns" (.hashCode ns) ":" (.getName operation)))
         {(keyword (str "xmlns:ns" (.hashCode ns))) ns}
         data]]])))

(defn send-soap-request [url msg]
  (->
    (client/post url {:headers {"SOAPAction" "" "Content-Type" "text/xml; charset=utf-8"} :body msg})
    :body
    xml/parse-str
    :content
    first
    :content
    first
    :content
    first))

(defn get-schema-type [schema ns type]
  (let [schema-ns (.getSchema schema ns)
        schema-type (.getType schema-ns type)]
    schema-type))

(defn match-attributes [schema-type value]
  (let [content-type (.getContentType schema-type)
        sv (schema-visitor content-type value)]
    (visit-schema sv)
    (:attrs (get @map-types sv))))

(defn match-primitive [value type]
    value)

(defn match-input [r schema]
  (let [entry (key r)
        value (val r)
        name (.getName entry)
        qname (.getTypeName entry)
        ns (.getNamespaceURI qname)
        type (.getLocalPart qname)]
    (if (= "http://www.w3.org/2001/XMLSchema" ns)
      {name (match-primitive value type)}
      (let [schema-type (get-schema-type schema ns type)]
        (if (instance? XSSimpleType schema-type)
          [name (match-primitive value (.getName (.getPrimitiveType schema-type)))]
          [name (match-attributes schema-type value)]))))) ; or else (QName. ns name)? 

(defn match-inputs [m schema]
  (map #(match-input % schema) m))

(def map-to-xml)

(defn process-attributes [v]
  (if (vector? v)
    (map-to-xml v)
    v))

(defn item-to-element [item]
  (let [k (first item)
        v (second item)]
    (if (instance? QName k)
      (let [name (.getLocalPart k)
            ns (.getNamespaceURI k)]
        [(keyword (str "ns" (.hashCode ns) ":" name))
         {(keyword (str "xmlns:ns" (.hashCode ns))) ns}
         (process-attributes v)])
      [(keyword k) {} (process-attributes v)])))

(defn map-to-xml [m]
  (map item-to-element m))

(defn get-name [obj]
  (.getName obj))

(defn get-setters [obj]
  (filter #(.startsWith % "set") (map get-name (.getMethods (class obj)))))

(defn xml-to-attribute [xml-item]
  (let [attribute-name (name (:tag xml-item))]
    {(str "set" (clojure.string/upper-case (first attribute-name)) (.substring attribute-name 1))
     (first (:content xml-item))}))

(defn xml-to-map [xml]
  (apply merge (map xml-to-attribute xml)))

(def match-output)

(defn apply-operation [obj operation]
  (let [methods (into [] (.getMethods (class obj)))
        filtered (filter #(.endsWith (.getName %) (key operation)) methods)
        method (first filtered)
        type (.getName (first (into [] (.getParameterTypes method))))]
    (cond
      (.startsWith type "javax.xml.datatype.XMLGregorianCalendar")
        (clojure.lang.Reflector/invokeInstanceMethod obj (key operation) (into-array (list (.newXMLGregorianCalendar (DatatypeFactory/newInstance) (val operation)))))
      (or
        (.startsWith type "javax.xml.datatype.")
        (.startsWith type "java.lang."))
        (clojure.lang.Reflector/invokeInstanceMethod obj (key operation) (into-array (list (val operation))))
      (or (= type "int"))
        (clojure.lang.Reflector/invokeInstanceMethod obj (key operation) (into-array (list (Integer/parseInt (val operation)))))
      (or (= type "float"))
        (clojure.lang.Reflector/invokeInstanceMethod obj (key operation) (into-array (list (Float/parseFloat (val operation)))))
      (or (= type "bool") (= type "boolean"))
        (clojure.lang.Reflector/invokeInstanceMethod obj (key operation) (into-array (list (Boolean/parseBoolean (val operation)))))
      :else ; adhoc object!
        (do
          (let [nested (-> type symbol resolve .newInstance)
                structure (if (instance? clojure.data.xml.Element (first (val operation)))
                            (val operation)
                            (list (val operation)))]
            (clojure.lang.Reflector/invokeInstanceMethod
              obj
              (key operation)
              (into-array (list (match-output structure nested)))))))))

(defn match-output [xml obj]
  (let [setters (into [] (get-setters obj))
        list-attr (xml-to-map xml)
        matched (apply merge (map #(hash-map % (get list-attr %)) setters))]
    (dorun (map #(apply-operation obj %) matched))
    obj))

(defn ^Object -callService [this ^String wsdl #^#=(array-of Object) params ^Class output]
  (let [wsdl-parts (clojure.string/split wsdl #"#")
        wsdl-url (first wsdl-parts)
        wsdl-operation (second wsdl-parts)
        wsdl-reader (WSDLReaderImpl.)]
    (.setFeature wsdl-reader "com.ibm.wsdl.parseXMLSchemas" true)
    (let [wsdl-obj (-> wsdl-reader (.readWSDL wsdl-url))
          ops (get-operations wsdl-obj)
          op (get-operation ops wsdl-operation)
          sch (get-schema wsdl-obj)
          inputs (-> op .getInput .getMessage (.getOrderedParts nil))
          outputs (-> op .getOutput .getMessage (.getOrderedParts nil))
          map-inputs (apply hash-map (interleave inputs params))
          actual-inputs (match-inputs map-inputs sch)
          xml-inputs (map-to-xml actual-inputs)
          soap-request (generate-soap-request (.getTargetNamespace wsdl-obj) op xml-inputs)
          call-url (clojure.string/replace wsdl-url "?WSDL" "")
          response (send-soap-request call-url soap-request)]
      ;(println response)
      (match-output (:content response) (.newInstance output)))))

;; Compile, if we can
;; Should fail when called from Java (AOT) but that's fine
(try
  (set! *compile-path* "contrib/clojure-binaries")
  (compile 'com.github.tranchis.caller.Caller)
  (catch Exception e))
