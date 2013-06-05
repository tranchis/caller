
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Oferta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Oferta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pertany_a_un" type="{http://www.owl-ontologies.com/ECSDIServices}Centre_de_salut"/>
 *         &lt;element name="esta_disponible_en" type="{http://www.owl-ontologies.com/ECSDIServices}Disponibilitat"/>
 *         &lt;element name="es_per_una" type="{http://www.owl-ontologies.com/ECSDIServices}Accio"/>
 *         &lt;element name="costa" type="{http://www.owl-ontologies.com/ECSDIServices}Preu"/>
 *         &lt;element name="correspon_a" type="{http://www.owl-ontologies.com/ECSDIServices}Professional_sanitari"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Oferta", propOrder = {
    "pertanyAUn",
    "estaDisponibleEn",
    "esPerUna",
    "costa",
    "corresponA"
})
public class Oferta {

    @XmlElement(name = "pertany_a_un", required = true)
    protected CentreDeSalut pertanyAUn;
    @XmlElement(name = "esta_disponible_en", required = true)
    protected Disponibilitat estaDisponibleEn;
    @XmlElement(name = "es_per_una", required = true)
    protected Accio esPerUna;
    @XmlElement(required = true)
    protected Preu costa;
    @XmlElement(name = "correspon_a", required = true)
    protected ProfessionalSanitari corresponA;

    /**
     * Gets the value of the pertanyAUn property.
     * 
     * @return
     *     possible object is
     *     {@link CentreDeSalut }
     *     
     */
    public CentreDeSalut getPertanyAUn() {
        return pertanyAUn;
    }

    /**
     * Sets the value of the pertanyAUn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentreDeSalut }
     *     
     */
    public void setPertanyAUn(CentreDeSalut value) {
        this.pertanyAUn = value;
    }

    /**
     * Gets the value of the estaDisponibleEn property.
     * 
     * @return
     *     possible object is
     *     {@link Disponibilitat }
     *     
     */
    public Disponibilitat getEstaDisponibleEn() {
        return estaDisponibleEn;
    }

    /**
     * Sets the value of the estaDisponibleEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disponibilitat }
     *     
     */
    public void setEstaDisponibleEn(Disponibilitat value) {
        this.estaDisponibleEn = value;
    }

    /**
     * Gets the value of the esPerUna property.
     * 
     * @return
     *     possible object is
     *     {@link Accio }
     *     
     */
    public Accio getEsPerUna() {
        return esPerUna;
    }

    /**
     * Sets the value of the esPerUna property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accio }
     *     
     */
    public void setEsPerUna(Accio value) {
        this.esPerUna = value;
    }

    /**
     * Gets the value of the costa property.
     * 
     * @return
     *     possible object is
     *     {@link Preu }
     *     
     */
    public Preu getCosta() {
        return costa;
    }

    /**
     * Sets the value of the costa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preu }
     *     
     */
    public void setCosta(Preu value) {
        this.costa = value;
    }

    /**
     * Gets the value of the corresponA property.
     * 
     * @return
     *     possible object is
     *     {@link ProfessionalSanitari }
     *     
     */
    public ProfessionalSanitari getCorresponA() {
        return corresponA;
    }

    /**
     * Sets the value of the corresponA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfessionalSanitari }
     *     
     */
    public void setCorresponA(ProfessionalSanitari value) {
        this.corresponA = value;
    }

}
