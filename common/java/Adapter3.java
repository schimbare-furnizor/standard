//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 09:57:30 AM EEST 
//


package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.UUID;

public class Adapter3
    extends XmlAdapter<String, UUID>
{


    public UUID unmarshal(String value) {
        return (ro.anre.anreschema.jaxb.Adapter.parseUuid(value));
    }

    public String marshal(UUID value) {
        return (ro.anre.anreschema.jaxb.Adapter.printUuid(value));
    }

}
