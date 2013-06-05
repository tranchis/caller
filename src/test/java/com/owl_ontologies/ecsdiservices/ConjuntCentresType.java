
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Conjunt_centresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conjunt_centresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoritza_els_centres" type="{http://www.owl-ontologies.com/ECSDIServices}Centre_de_salut" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conjunt_centresType", propOrder = {
    "autoritzaElsCentres"
})
public class ConjuntCentresType {

    @XmlElement(name = "autoritza_els_centres")
    protected List<CentreDeSalut> autoritzaElsCentres;

    /**
     * Gets the value of the autoritzaElsCentres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoritzaElsCentres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoritzaElsCentres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CentreDeSalut }
     * 
     * 
     */
    public List<CentreDeSalut> getAutoritzaElsCentres() {
        if (autoritzaElsCentres == null) {
            autoritzaElsCentres = new ArrayList<CentreDeSalut>();
        }
        return this.autoritzaElsCentres;
    }

}
