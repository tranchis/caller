
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pacient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pacient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroSS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prefereix" type="{http://www.owl-ontologies.com/ECSDIServices}Preferencia" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="te_histories" type="{http://www.owl-ontologies.com/ECSDIServices}Historia" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="viu_a" type="{http://www.owl-ontologies.com/ECSDIServices}Coordenades"/>
 *         &lt;element name="esta_cobert_per" type="{http://www.owl-ontologies.com/ECSDIServices}Polissa" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pacient", propOrder = {
    "dni",
    "numeroSS",
    "prefereix",
    "teHistories",
    "viuA",
    "estaCobertPer"
})
public class Pacient {

    @XmlElement(name = "DNI", required = true)
    protected String dni;
    @XmlElement(name = "NumeroSS", required = true)
    protected String numeroSS;
    protected List<String> prefereix;
    @XmlElement(name = "te_histories")
    protected List<Historia> teHistories;
    @XmlElement(name = "viu_a", required = true)
    protected Coordenades viuA;
    @XmlElement(name = "esta_cobert_per")
    protected List<Polissa> estaCobertPer;

    /**
     * Gets the value of the dni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNI() {
        return dni;
    }

    /**
     * Sets the value of the dni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNI(String value) {
        this.dni = value;
    }

    /**
     * Gets the value of the numeroSS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSS() {
        return numeroSS;
    }

    /**
     * Sets the value of the numeroSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSS(String value) {
        this.numeroSS = value;
    }

    /**
     * Gets the value of the prefereix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefereix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefereix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrefereix() {
        if (prefereix == null) {
            prefereix = new ArrayList<String>();
        }
        return this.prefereix;
    }

    /**
     * Gets the value of the teHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Historia }
     * 
     * 
     */
    public List<Historia> getTeHistories() {
        if (teHistories == null) {
            teHistories = new ArrayList<Historia>();
        }
        return this.teHistories;
    }

    /**
     * Gets the value of the viuA property.
     * 
     * @return
     *     possible object is
     *     {@link Coordenades }
     *     
     */
    public Coordenades getViuA() {
        return viuA;
    }

    /**
     * Sets the value of the viuA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordenades }
     *     
     */
    public void setViuA(Coordenades value) {
        this.viuA = value;
    }

    /**
     * Gets the value of the estaCobertPer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estaCobertPer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstaCobertPer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polissa }
     * 
     * 
     */
    public List<Polissa> getEstaCobertPer() {
        if (estaCobertPer == null) {
            estaCobertPer = new ArrayList<Polissa>();
        }
        return this.estaCobertPer;
    }

}
