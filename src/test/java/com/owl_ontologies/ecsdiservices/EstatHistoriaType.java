
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Estat_historiaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Estat_historiaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="iniciada"/>
 *     &lt;enumeration value="finalitzada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Estat_historiaType")
@XmlEnum
public enum EstatHistoriaType {

    @XmlEnumValue("iniciada")
    INICIADA("iniciada"),
    @XmlEnumValue("finalitzada")
    FINALITZADA("finalitzada");
    private final String value;

    EstatHistoriaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstatHistoriaType fromValue(String v) {
        for (EstatHistoriaType c: EstatHistoriaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
