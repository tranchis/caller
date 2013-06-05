
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Conjunt_restriccionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conjunt_restriccionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seguint" type="{http://www.owl-ontologies.com/ECSDIServices}Restriccio" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conjunt_restriccionsType", propOrder = {
    "seguint"
})
public class ConjuntRestriccionsType {

    protected List<String> seguint;

    /**
     * Gets the value of the seguint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seguint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeguint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeguint() {
        if (seguint == null) {
            seguint = new ArrayList<String>();
        }
        return this.seguint;
    }

}
