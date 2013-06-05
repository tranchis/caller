
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Estat_citaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Estat_citaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="concertada"/>
 *     &lt;enumeration value="cancelada"/>
 *     &lt;enumeration value="realitzada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Estat_citaType")
@XmlEnum
public enum EstatCitaType {

    @XmlEnumValue("concertada")
    CONCERTADA("concertada"),
    @XmlEnumValue("cancelada")
    CANCELADA("cancelada"),
    @XmlEnumValue("realitzada")
    REALITZADA("realitzada");
    private final String value;

    EstatCitaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstatCitaType fromValue(String v) {
        for (EstatCitaType c: EstatCitaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
