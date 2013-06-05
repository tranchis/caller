
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Conjunt_resultatsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conjunt_resultatsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conte_resultats" type="{http://www.owl-ontologies.com/ECSDIServices}Resultat" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conjunt_resultatsType", propOrder = {
    "conteResultats"
})
public class ConjuntResultatsType {

    @XmlElement(name = "conte_resultats")
    protected List<Resultat> conteResultats;

    /**
     * Gets the value of the conteResultats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conteResultats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConteResultats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resultat }
     * 
     * 
     */
    public List<Resultat> getConteResultats() {
        if (conteResultats == null) {
            conteResultats = new ArrayList<Resultat>();
        }
        return this.conteResultats;
    }

}
