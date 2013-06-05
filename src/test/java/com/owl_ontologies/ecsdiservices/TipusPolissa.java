
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tipus_polissa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tipus_polissa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nivell_de_cobertura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cobreix" type="{http://www.owl-ontologies.com/ECSDIServices}Accio" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tipus_polissa", propOrder = {
    "nivellDeCobertura",
    "cobreix"
})
public class TipusPolissa {

    @XmlElement(name = "Nivell_de_cobertura", required = true)
    protected String nivellDeCobertura;
    protected List<Accio> cobreix;

    /**
     * Gets the value of the nivellDeCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivellDeCobertura() {
        return nivellDeCobertura;
    }

    /**
     * Sets the value of the nivellDeCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivellDeCobertura(String value) {
        this.nivellDeCobertura = value;
    }

    /**
     * Gets the value of the cobreix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobreix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCobreix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accio }
     * 
     * 
     */
    public List<Accio> getCobreix() {
        if (cobreix == null) {
            cobreix = new ArrayList<Accio>();
        }
        return this.cobreix;
    }

}
