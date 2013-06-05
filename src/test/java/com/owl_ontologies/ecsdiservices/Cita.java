
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cita complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cita">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Estat_cita" type="{http://www.owl-ontologies.com/ECSDIServices}Estat_citaType" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="ha_citat" type="{http://www.owl-ontologies.com/ECSDIServices}PacientType"/>
 *         &lt;element name="te_lloc_a" type="{http://www.owl-ontologies.com/ECSDIServices}Centre_de_salut"/>
 *         &lt;element name="citat_per" type="{http://www.owl-ontologies.com/ECSDIServices}Professional_sanitari"/>
 *         &lt;element name="produeix" type="{http://www.owl-ontologies.com/ECSDIServices}Resultat" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="per_realitzar" type="{http://www.owl-ontologies.com/ECSDIServices}Accio"/>
 *         &lt;element name="te_lloc_en" type="{http://www.owl-ontologies.com/ECSDIServices}Franja_horaria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cita", propOrder = {
    "estatCita",
    "haCitat",
    "teLlocA",
    "citatPer",
    "produeix",
    "perRealitzar",
    "teLlocEn"
})
public class Cita {

    @XmlElement(name = "Estat_cita")
    protected List<EstatCitaType> estatCita;
    @XmlElement(name = "ha_citat", required = true)
    protected PacientType haCitat;
    @XmlElement(name = "te_lloc_a", required = true)
    protected CentreDeSalut teLlocA;
    @XmlElement(name = "citat_per", required = true)
    protected ProfessionalSanitari citatPer;
    protected List<Resultat> produeix;
    @XmlElement(name = "per_realitzar", required = true)
    protected Accio perRealitzar;
    @XmlElement(name = "te_lloc_en", required = true)
    protected FranjaHoraria teLlocEn;

    /**
     * Gets the value of the estatCita property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estatCita property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstatCita().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstatCitaType }
     * 
     * 
     */
    public List<EstatCitaType> getEstatCita() {
        if (estatCita == null) {
            estatCita = new ArrayList<EstatCitaType>();
        }
        return this.estatCita;
    }

    /**
     * Gets the value of the haCitat property.
     * 
     * @return
     *     possible object is
     *     {@link PacientType }
     *     
     */
    public PacientType getHaCitat() {
        return haCitat;
    }

    /**
     * Sets the value of the haCitat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacientType }
     *     
     */
    public void setHaCitat(PacientType value) {
        this.haCitat = value;
    }

    /**
     * Gets the value of the teLlocA property.
     * 
     * @return
     *     possible object is
     *     {@link CentreDeSalut }
     *     
     */
    public CentreDeSalut getTeLlocA() {
        return teLlocA;
    }

    /**
     * Sets the value of the teLlocA property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentreDeSalut }
     *     
     */
    public void setTeLlocA(CentreDeSalut value) {
        this.teLlocA = value;
    }

    /**
     * Gets the value of the citatPer property.
     * 
     * @return
     *     possible object is
     *     {@link ProfessionalSanitari }
     *     
     */
    public ProfessionalSanitari getCitatPer() {
        return citatPer;
    }

    /**
     * Sets the value of the citatPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfessionalSanitari }
     *     
     */
    public void setCitatPer(ProfessionalSanitari value) {
        this.citatPer = value;
    }

    /**
     * Gets the value of the produeix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produeix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdueix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resultat }
     * 
     * 
     */
    public List<Resultat> getProdueix() {
        if (produeix == null) {
            produeix = new ArrayList<Resultat>();
        }
        return this.produeix;
    }

    /**
     * Gets the value of the perRealitzar property.
     * 
     * @return
     *     possible object is
     *     {@link Accio }
     *     
     */
    public Accio getPerRealitzar() {
        return perRealitzar;
    }

    /**
     * Sets the value of the perRealitzar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accio }
     *     
     */
    public void setPerRealitzar(Accio value) {
        this.perRealitzar = value;
    }

    /**
     * Gets the value of the teLlocEn property.
     * 
     * @return
     *     possible object is
     *     {@link FranjaHoraria }
     *     
     */
    public FranjaHoraria getTeLlocEn() {
        return teLlocEn;
    }

    /**
     * Sets the value of the teLlocEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FranjaHoraria }
     *     
     */
    public void setTeLlocEn(FranjaHoraria value) {
        this.teLlocEn = value;
    }

}
