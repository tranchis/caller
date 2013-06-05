
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Centre_de_salut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Centre_de_salut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URLServeiDisponibilitat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="es_troba_a" type="{http://www.owl-ontologies.com/ECSDIServices}Coordenades" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="pot_realitzar" type="{http://www.owl-ontologies.com/ECSDIServices}Accio" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Centre_de_salut", propOrder = {
    "urlServeiDisponibilitat",
    "esTrobaA",
    "potRealitzar"
})
public class CentreDeSalut {

    @XmlElement(name = "URLServeiDisponibilitat", required = true)
    protected String urlServeiDisponibilitat;
    @XmlElement(name = "es_troba_a")
    protected List<Coordenades> esTrobaA;
    @XmlElement(name = "pot_realitzar")
    protected List<Accio> potRealitzar;

    /**
     * Gets the value of the urlServeiDisponibilitat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLServeiDisponibilitat() {
        return urlServeiDisponibilitat;
    }

    /**
     * Sets the value of the urlServeiDisponibilitat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLServeiDisponibilitat(String value) {
        this.urlServeiDisponibilitat = value;
    }

    /**
     * Gets the value of the esTrobaA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esTrobaA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEsTrobaA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coordenades }
     * 
     * 
     */
    public List<Coordenades> getEsTrobaA() {
        if (esTrobaA == null) {
            esTrobaA = new ArrayList<Coordenades>();
        }
        return this.esTrobaA;
    }

    /**
     * Gets the value of the potRealitzar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the potRealitzar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPotRealitzar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accio }
     * 
     * 
     */
    public List<Accio> getPotRealitzar() {
        if (potRealitzar == null) {
            potRealitzar = new ArrayList<Accio>();
        }
        return this.potRealitzar;
    }

}
