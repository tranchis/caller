
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.owl_ontologies.ecsdiservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConjuntRestriccions_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServices", "Conjunt_restriccions");
    private final static QName _ConjuntCentres_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServices", "Conjunt_centres");
    private final static QName _Pacient_QNAME = new QName("http://www.owl-ontologies.com/ECSDIServices", "Pacient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.owl_ontologies.ecsdiservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FranjaHoraria }
     * 
     */
    public FranjaHoraria createFranjaHoraria() {
        return new FranjaHoraria();
    }

    /**
     * Create an instance of {@link Polissa }
     * 
     */
    public Polissa createPolissa() {
        return new Polissa();
    }

    /**
     * Create an instance of {@link Pauta }
     * 
     */
    public Pauta createPauta() {
        return new Pauta();
    }

    /**
     * Create an instance of {@link Resultat }
     * 
     */
    public Resultat createResultat() {
        return new Resultat();
    }

    /**
     * Create an instance of {@link Asseguradora }
     * 
     */
    public Asseguradora createAsseguradora() {
        return new Asseguradora();
    }

    /**
     * Create an instance of {@link ConjuntCentresType }
     * 
     */
    public ConjuntCentresType createConjuntCentresType() {
        return new ConjuntCentresType();
    }

    /**
     * Create an instance of {@link CentreDeSalut }
     * 
     */
    public CentreDeSalut createCentreDeSalut() {
        return new CentreDeSalut();
    }

    /**
     * Create an instance of {@link ProfessionalSanitari }
     * 
     */
    public ProfessionalSanitari createProfessionalSanitari() {
        return new ProfessionalSanitari();
    }

    /**
     * Create an instance of {@link Coordenades }
     * 
     */
    public Coordenades createCoordenades() {
        return new Coordenades();
    }

    /**
     * Create an instance of {@link Accio }
     * 
     */
    public Accio createAccio() {
        return new Accio();
    }

    /**
     * Create an instance of {@link Cita }
     * 
     */
    public Cita createCita() {
        return new Cita();
    }

    /**
     * Create an instance of {@link TipusPolissa }
     * 
     */
    public TipusPolissa createTipusPolissa() {
        return new TipusPolissa();
    }

    /**
     * Create an instance of {@link PacientType }
     * 
     */
    public PacientType createPacientType() {
        return new PacientType();
    }

    /**
     * Create an instance of {@link ConjuntRestriccionsType }
     * 
     */
    public ConjuntRestriccionsType createConjuntRestriccionsType() {
        return new ConjuntRestriccionsType();
    }

    /**
     * Create an instance of {@link Historia }
     * 
     */
    public Historia createHistoria() {
        return new Historia();
    }

    /**
     * Create an instance of {@link ConjuntRestriccions }
     * 
     */
    public ConjuntRestriccions createConjuntRestriccions() {
        return new ConjuntRestriccions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConjuntRestriccionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServices", name = "Conjunt_restriccions")
    public JAXBElement<ConjuntRestriccionsType> createConjuntRestriccions(ConjuntRestriccionsType value) {
        return new JAXBElement<ConjuntRestriccionsType>(_ConjuntRestriccions_QNAME, ConjuntRestriccionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConjuntCentresType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServices", name = "Conjunt_centres")
    public JAXBElement<ConjuntCentresType> createConjuntCentres(ConjuntCentresType value) {
        return new JAXBElement<ConjuntCentresType>(_ConjuntCentres_QNAME, ConjuntCentresType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.owl-ontologies.com/ECSDIServices", name = "Pacient")
    public JAXBElement<PacientType> createPacient(PacientType value) {
        return new JAXBElement<PacientType>(_Pacient_QNAME, PacientType.class, null, value);
    }

}
