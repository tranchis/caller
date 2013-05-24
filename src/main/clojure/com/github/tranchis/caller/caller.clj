(ns com.github.tranchis.caller
  (:gen-class)
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
        java.io.ByteArrayInputStream
        (com.owl_ontologies.ecsdiservices EcografiaType Imagen)
        (com.sun.xml.xsom XSSimpleType XSComplexType)
        com.sun.xml.xsom.visitor.XSContentTypeVisitor)

(defn array-of [cname]
  (-> cname resolve .newInstance list into-array class .getName))

(defn schema-visitor []
  (reify
    com.sun.xml.xsom.visitor.XSVisitor
    (empty [this empty]
      (println "empty"))
    (particle [this particle]
      (println "particle")
      (let [term (.getTerm particle)]
        (if (.isModelGroup term)
          (let [particles (.getChildren term)]
            (map #(.getName (.getTerm %)) particles)))))
    (simpleType [this simpleType]
      (println "simpleType"))
    (complexType [this complexType]
      (println "complexType"))))

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

(defn generate-soap-request []
  (xml/emit-str
    (xml/sexp-as-element
      [:S:Envelope {:xmlns:S "http://schemas.xmlsoap.org/soap/envelope/"}
       [:S:Header]
       [:S:Body
        [:ns2:hello {:xmlns:ns2 "http://test/"}
         [:name {} "dolly"]]]])))

(defn send-soap-request [msg]
  (client/post "http://localhost:8080/WebServiceExample/CitaService" {:headers {"SOAPAction" "" "Content-Type" "text/xml; charset=utf-8"} :body msg}))

(defn get-schema-type [schema ns type]
  (let [schema-ns (.getSchema schema ns)
        schema-type (.getType schema-ns type)]
    schema-type))

(defn match-attributes [schema-type value]
  (println schema-type)
  (let [content-type (.getContentType schema-type)
        sv (schema-visitor)]
    (.visit content-type sv)
    (println (.test sv))
    (println content-type)))

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
          {name (match-primitive value (.getName (.getPrimitiveType schema-type)))}
          {name (match-attributes schema-type value)})))))

(defn match-inputs [m schema]
  (map #(match-input % schema) m))

(defn -callService [^String wsdl #^#=(array-of Object) params ^Class output]
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
          actual-inputs (match-inputs map-inputs sch)]
      actual-inputs)))

(-callService "http://localhost:8080/ExampleWebApplication/EcografiaService?WSDL#asignarCita" (to-array [(EcografiaType.) "sergio"]) String)
