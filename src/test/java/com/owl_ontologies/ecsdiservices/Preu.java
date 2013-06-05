
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Preu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Moneda" type="{http://www.owl-ontologies.com/ECSDIServices}MonedaType" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="Quantitat" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preu", propOrder = {
    "moneda",
    "quantitat"
})
public class Preu {

    @XmlElement(name = "Moneda")
    protected List<MonedaType> moneda;
    @XmlElement(name = "Quantitat", type = Float.class)
    protected List<Float> quantitat;

    /**
     * Gets the value of the moneda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moneda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoneda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonedaType }
     * 
     * 
     */
    public List<MonedaType> getMoneda() {
        if (moneda == null) {
            moneda = new ArrayList<MonedaType>();
        }
        return this.moneda;
    }

    /**
     * Gets the value of the quantitat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantitat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantitat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getQuantitat() {
        if (quantitat == null) {
            quantitat = new ArrayList<Float>();
        }
        return this.quantitat;
    }

}
