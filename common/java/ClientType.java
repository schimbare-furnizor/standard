
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOUSEHOLD"/>
 *     &lt;enumeration value="NON_HOUSEHOLD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClientType")
@XmlEnum
public enum ClientType {

    HOUSEHOLD,
    NON_HOUSEHOLD;

    public String value() {
        return name();
    }

    public static ClientType fromValue(String v) {
        return valueOf(v);
    }

}
