
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Coordenades complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coordenades">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Altitud" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="Latitud" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coordenades", propOrder = {
    "altitud",
    "latitud"
})
public class Coordenades {

    @XmlElement(name = "Altitud", type = Float.class)
    protected List<Float> altitud;
    @XmlElement(name = "Latitud", type = Float.class)
    protected List<Float> latitud;

    /**
     * Gets the value of the altitud property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altitud property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltitud().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getAltitud() {
        if (altitud == null) {
            altitud = new ArrayList<Float>();
        }
        return this.altitud;
    }

    /**
     * Gets the value of the latitud property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latitud property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatitud().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getLatitud() {
        if (latitud == null) {
            latitud = new ArrayList<Float>();
        }
        return this.latitud;
    }

}
