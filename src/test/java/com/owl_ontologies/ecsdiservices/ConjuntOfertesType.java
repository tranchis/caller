
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Conjunt_ofertesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conjunt_ofertesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ofereix" type="{http://www.owl-ontologies.com/ECSDIServices}Oferta" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conjunt_ofertesType", propOrder = {
    "ofereix"
})
public class ConjuntOfertesType {

    protected List<Oferta> ofereix;

    /**
     * Gets the value of the ofereix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ofereix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfereix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Oferta }
     * 
     * 
     */
    public List<Oferta> getOfereix() {
        if (ofereix == null) {
            ofereix = new ArrayList<Oferta>();
        }
        return this.ofereix;
    }

}
