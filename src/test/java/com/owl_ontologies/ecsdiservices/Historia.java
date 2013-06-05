
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Historia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Historia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descripcio_inicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Estat_historia" type="{http://www.owl-ontologies.com/ECSDIServices}Estat_historiaType"/>
 *         &lt;element name="esta_formada_per" type="{http://www.owl-ontologies.com/ECSDIServices}Cita" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="distribuida_en" type="{http://www.owl-ontologies.com/ECSDIServices}Pauta" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Historia", propOrder = {
    "descripcioInicial",
    "estatHistoria",
    "estaFormadaPer",
    "distribuidaEn"
})
public class Historia {

    @XmlElement(name = "Descripcio_inicial", required = true)
    protected String descripcioInicial;
    @XmlElement(name = "Estat_historia", required = true)
    protected EstatHistoriaType estatHistoria;
    @XmlElement(name = "esta_formada_per")
    protected List<Cita> estaFormadaPer;
    @XmlElement(name = "distribuida_en")
    protected List<Pauta> distribuidaEn;

    /**
     * Gets the value of the descripcioInicial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcioInicial() {
        return descripcioInicial;
    }

    /**
     * Sets the value of the descripcioInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcioInicial(String value) {
        this.descripcioInicial = value;
    }

    /**
     * Gets the value of the estatHistoria property.
     * 
     * @return
     *     possible object is
     *     {@link EstatHistoriaType }
     *     
     */
    public EstatHistoriaType getEstatHistoria() {
        return estatHistoria;
    }

    /**
     * Sets the value of the estatHistoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstatHistoriaType }
     *     
     */
    public void setEstatHistoria(EstatHistoriaType value) {
        this.estatHistoria = value;
    }

    /**
     * Gets the value of the estaFormadaPer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estaFormadaPer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstaFormadaPer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cita }
     * 
     * 
     */
    public List<Cita> getEstaFormadaPer() {
        if (estaFormadaPer == null) {
            estaFormadaPer = new ArrayList<Cita>();
        }
        return this.estaFormadaPer;
    }

    /**
     * Gets the value of the distribuidaEn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distribuidaEn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistribuidaEn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pauta }
     * 
     * 
     */
    public List<Pauta> getDistribuidaEn() {
        if (distribuidaEn == null) {
            distribuidaEn = new ArrayList<Pauta>();
        }
        return this.distribuidaEn;
    }

}
