(ns com.github.tranchis.caller.CallerTest
  (require [clj-http.client :as client])
  (require [clojure.data.xml :as xml]
           [clojure.zip :as zip])
  (use com.github.tranchis.caller.Caller))

(import (com.owl_ontologies.ecsdiservices ConjuntCentresType ConjuntOfertesType))

(let [result (client/post "http://localhost:8080/ECSDI2/Asseguradora1PortTypeService" {:headers {"SOAPAction" "" "Content-Type" "text/xml; charset=utf-8"}
                               :body "<?xml version='1.0' encoding='UTF-8'?><S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\"><S:Header></S:Header><S:Body><ns1716564955:LlistaCentresDeSalut xmlns:ns1716564955=\"http://www.owl-ontologies.com/ECSDIServices\"><InputRestriccions><seguint></seguint></InputRestriccions><InputAccioAutoritzacio>http://www.owl-ontologies.com/ECSDIOntology.owl#Analisi_de_orina</InputAccioAutoritzacio><InputPacientAutoritzacio><DNI></DNI><NumeroSS></NumeroSS><prefereix></prefereix></InputPacientAutoritzacio></ns1716564955:LlistaCentresDeSalut></S:Body></S:Envelope>"})]
    ;;(println result)
    (->
      result
      :body))

(let [str "<?xml version='1.0' encoding='UTF-8'?>
<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">
<S:Body>
<ns1716564955:OutputCentresAutoritzats xmlns:ns1716564955=\"http://www.owl-ontologies.com/ECSDIServices\">
<autoritza_els_centres>
<URLServeiDisponibilitat>http://localhost:8080/ECSDI2/Centre2PortTypeService?WSDL#DemanarDisponibilitat</URLServeiDisponibilitat>
</autoritza_els_centres>
</ns1716564955:OutputCentresAutoritzats>
</S:Body>
</S:Envelope>"]
  (println str)
  (let [response (-> str xml/parse-str :content first :content first)]
    (println response)
    (println "response: [" (xml/emit-str response) "]")
    (let [output (match-output (:content response) (ConjuntCentresType.))]
      (println (.getAutoritzaElsCentres output))
      (dorun (map #(println (.getURLServeiDisponibilitat %)) (.getAutoritzaElsCentres output))))))

(let [str "<?xml version='1.0' encoding='UTF-8'?>
<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">
<S:Body>
<ns1716564955:ofertesMetgeEspecialistaAnestesista xmlns:ns1716564955=\"http://www.owl-ontologies.com/ECSDIServices\">
<ofereix>
</ofereix>
<ofereix>
</ofereix>
<ofereix>
</ofereix>
<ofereix>
</ofereix>
<ofereix>
</ofereix>
<ofereix>
</ofereix>
</ns1716564955:ofertesMetgeEspecialistaAnestesista>
</S:Body>
</S:Envelope>"]
  (println str)
  (let [response (-> str xml/parse-str :content first :content first)]
    (println response)
    (println "response: [" (xml/emit-str response) "]")
    (let [output (match-output (:content response) (ConjuntOfertesType.))]
      (println (.getOfereix output))
      (dorun (map #(println %) (.getOfereix output))))))

(let [str "<?xml version='1.0' encoding='UTF-8'?>
<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">
<S:Body>
<ns1716564955:OutputCentresAutoritzats xmlns:ns1716564955=\"http://www.owl-ontologies.com/ECSDIServices\">
<autoritza_els_centres>
<URLServeiDisponibilitat>http://localhost:8080/ECSDI/Centre1PortTypeService?WSDL#DemanarDisponibilitat</URLServeiDisponibilitat>
</autoritza_els_centres>
<autoritza_els_centres>
<URLServeiDisponibilitat>http://localhost:8080/ECSDI/Centre2PortTypeService?WSDL#DemanarDisponibilitat</URLServeiDisponibilitat>
</autoritza_els_centres>
</ns1716564955:OutputCentresAutoritzats>
</S:Body>
</S:Envelope>"]
  (println str)
  (let [response (-> str xml/parse-str :content first :content first)]
    (println response)
    (println "response: [" (xml/emit-str response) "]")
    (let [output (match-output (:content response) (ConjuntCentresType.))]
      (println (.getAutoritzaElsCentres output))
      (dorun (map #(println (.getURLServeiDisponibilitat %)) (.getAutoritzaElsCentres output))))))

(let [str "<?xml version='1.0' encoding='UTF-8'?>
<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">
<S:Body>
<ns1716564955:OutputCentresAutoritzats xmlns:ns1716564955=\"http://www.owl-ontologies.com/ECSDIServices\">
<autoritza_els_centres>
<URLServeiDisponibilitat>http://localhost:8080/ECSDI/Centre6PortTypeService?WSDL#DemanarDisponibilitat</URLServeiDisponibilitat>
</autoritza_els_centres>
<autoritza_els_centres>
<URLServeiDisponibilitat>http://localhost:8080/ECSDI/Centre5PortTypeService?WSDL#DemanarDisponibilitat</URLServeiDisponibilitat>
</autoritza_els_centres>
</ns1716564955:OutputCentresAutoritzats>
</S:Body>
</S:Envelope>"]
  (println str)
  (let [response (-> str xml/parse-str :content first :content first)]
    (println response)
    (println "response: [" (xml/emit-str response) "]")
    (let [output (match-output (:content response) (ConjuntCentresType.))]
      (println (.getAutoritzaElsCentres output))
      (dorun (map #(println (.getURLServeiDisponibilitat %)) (.getAutoritzaElsCentres output))))))

;(let [result (client/post "http://localhost:8080/ECSDI2/Asseguradora1PortTypeService" {:headers {"SOAPAction" "" "Content-Type" "text/xml; charset=utf-8"}
;                               :body "<?xml version=\"1.0\" encoding=\"UTF-8\"?>
;<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">
;    <S:Header/>
;    <S:Body>
;        <ns2:init xmlns:ns2=\"http://www.owl-ontologies.com/ECSDIServices\"/>
;    </S:Body>
;</S:Envelope>"})]
;    ;;(println result)
;    (->
;      result
;      :body
;      ))
