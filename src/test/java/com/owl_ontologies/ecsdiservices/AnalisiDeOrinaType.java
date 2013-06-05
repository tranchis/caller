
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Analisi_de_orinaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Analisi_de_orinaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pot_ser_substituida_per" type="{http://www.owl-ontologies.com/ECSDIServices}Accio" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Analisi_de_orinaType", propOrder = {
    "potSerSubstituidaPer"
})
public class AnalisiDeOrinaType {

    @XmlElement(name = "pot_ser_substituida_per")
    protected List<Accio> potSerSubstituidaPer;

    /**
     * Gets the value of the potSerSubstituidaPer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the potSerSubstituidaPer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPotSerSubstituidaPer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accio }
     * 
     * 
     */
    public List<Accio> getPotSerSubstituidaPer() {
        if (potSerSubstituidaPer == null) {
            potSerSubstituidaPer = new ArrayList<Accio>();
        }
        return this.potSerSubstituidaPer;
    }

}
