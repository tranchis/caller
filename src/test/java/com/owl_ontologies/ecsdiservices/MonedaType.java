
package com.owl_ontologies.ecsdiservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonedaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonedaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="euro"/>
 *     &lt;enumeration value="dollar"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonedaType")
@XmlEnum
public enum MonedaType {

    @XmlEnumValue("euro")
    EURO("euro"),
    @XmlEnumValue("dollar")
    DOLLAR("dollar");
    private final String value;

    MonedaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonedaType fromValue(String v) {
        for (MonedaType c: MonedaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
