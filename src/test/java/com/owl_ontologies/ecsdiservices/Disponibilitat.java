
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Disponibilitat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Disponibilitat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conte_franjes" type="{http://www.owl-ontologies.com/ECSDIServices}Franja_horaria" maxOccurs="5000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disponibilitat", propOrder = {
    "conteFranjes"
})
public class Disponibilitat {

    @XmlElement(name = "conte_franjes", required = true)
    protected List<FranjaHoraria> conteFranjes;

    /**
     * Gets the value of the conteFranjes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conteFranjes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConteFranjes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FranjaHoraria }
     * 
     * 
     */
    public List<FranjaHoraria> getConteFranjes() {
        if (conteFranjes == null) {
            conteFranjes = new ArrayList<FranjaHoraria>();
        }
        return this.conteFranjes;
    }

}
