
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pauta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pauta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genera" type="{http://www.owl-ontologies.com/ECSDIServices}Conjunt_restriccions" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pauta", propOrder = {
    "genera"
})
public class Pauta {

    protected List<ConjuntRestriccions> genera;

    /**
     * Gets the value of the genera property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genera property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenera().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConjuntRestriccions }
     * 
     * 
     */
    public List<ConjuntRestriccions> getGenera() {
        if (genera == null) {
            genera = new ArrayList<ConjuntRestriccions>();
        }
        return this.genera;
    }

}
