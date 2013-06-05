
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Polissa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Polissa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="es_del_tipus_polissa" type="{http://www.owl-ontologies.com/ECSDIServices}Tipus_polissa" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="cobreix_a" type="{http://www.owl-ontologies.com/ECSDIServices}PacientType" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="pertany_a" type="{http://www.owl-ontologies.com/ECSDIServices}Asseguradora" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polissa", propOrder = {
    "esDelTipusPolissa",
    "cobreixA",
    "pertanyA"
})
public class Polissa {

    @XmlElement(name = "es_del_tipus_polissa")
    protected List<TipusPolissa> esDelTipusPolissa;
    @XmlElement(name = "cobreix_a")
    protected List<PacientType> cobreixA;
    @XmlElement(name = "pertany_a")
    protected List<Asseguradora> pertanyA;

    /**
     * Gets the value of the esDelTipusPolissa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esDelTipusPolissa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEsDelTipusPolissa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipusPolissa }
     * 
     * 
     */
    public List<TipusPolissa> getEsDelTipusPolissa() {
        if (esDelTipusPolissa == null) {
            esDelTipusPolissa = new ArrayList<TipusPolissa>();
        }
        return this.esDelTipusPolissa;
    }

    /**
     * Gets the value of the cobreixA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobreixA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCobreixA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PacientType }
     * 
     * 
     */
    public List<PacientType> getCobreixA() {
        if (cobreixA == null) {
            cobreixA = new ArrayList<PacientType>();
        }
        return this.cobreixA;
    }

    /**
     * Gets the value of the pertanyA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pertanyA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPertanyA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Asseguradora }
     * 
     * 
     */
    public List<Asseguradora> getPertanyA() {
        if (pertanyA == null) {
            pertanyA = new ArrayList<Asseguradora>();
        }
        return this.pertanyA;
    }

}
