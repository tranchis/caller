
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Asseguradora complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asseguradora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="es_responsable_de" type="{http://www.owl-ontologies.com/ECSDIServices}Polissa" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="te_adscrits" type="{http://www.owl-ontologies.com/ECSDIServices}Centre_de_salut" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asseguradora", propOrder = {
    "esResponsableDe",
    "teAdscrits"
})
public class Asseguradora {

    @XmlElement(name = "es_responsable_de")
    protected List<Polissa> esResponsableDe;
    @XmlElement(name = "te_adscrits")
    protected List<CentreDeSalut> teAdscrits;

    /**
     * Gets the value of the esResponsableDe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esResponsableDe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEsResponsableDe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polissa }
     * 
     * 
     */
    public List<Polissa> getEsResponsableDe() {
        if (esResponsableDe == null) {
            esResponsableDe = new ArrayList<Polissa>();
        }
        return this.esResponsableDe;
    }

    /**
     * Gets the value of the teAdscrits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teAdscrits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeAdscrits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CentreDeSalut }
     * 
     * 
     */
    public List<CentreDeSalut> getTeAdscrits() {
        if (teAdscrits == null) {
            teAdscrits = new ArrayList<CentreDeSalut>();
        }
        return this.teAdscrits;
    }

}
