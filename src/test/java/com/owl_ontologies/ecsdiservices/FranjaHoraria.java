
package com.owl_ontologies.ecsdiservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Franja_horaria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Franja_horaria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data_inici" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="Data_fi" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="5000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Franja_horaria", propOrder = {
    "dataInici",
    "dataFi"
})
public class FranjaHoraria {

    @XmlElement(name = "Data_inici")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> dataInici;
    @XmlElement(name = "Data_fi")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> dataFi;

    /**
     * Gets the value of the dataInici property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataInici property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataInici().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDataInici() {
        if (dataInici == null) {
            dataInici = new ArrayList<XMLGregorianCalendar>();
        }
        return this.dataInici;
    }

    /**
     * Gets the value of the dataFi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDataFi() {
        if (dataFi == null) {
            dataFi = new ArrayList<XMLGregorianCalendar>();
        }
        return this.dataFi;
    }

}
