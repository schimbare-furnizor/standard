
package ro.anre.anreschema.standard;

import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Furnizor
 * 
 * <p>Java class for Supplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Supplier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Company">
 *       &lt;sequence>
 *         &lt;element name="fuiType" type="{http://www.anre.ro/ANRESchema}FUIType"/>
 *         &lt;element name="isFUI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="supplierId" type="{http://www.anre.ro/ANRESchema}Guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supplier", propOrder = {
    "fuiType",
    "isFUI",
    "supplierId"
})
@XmlRootElement(name = "Supplier")
public class Supplier
    extends Company
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FUIType fuiType;
    protected boolean isFUI;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected UUID supplierId;

    /**
     * Gets the value of the fuiType property.
     * 
     * @return
     *     possible object is
     *     {@link FUIType }
     *     
     */
    public FUIType getFuiType() {
        return fuiType;
    }

    /**
     * Sets the value of the fuiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUIType }
     *     
     */
    public void setFuiType(FUIType value) {
        this.fuiType = value;
    }

    /**
     * Gets the value of the isFUI property.
     * 
     */
    public boolean isIsFUI() {
        return isFUI;
    }

    /**
     * Sets the value of the isFUI property.
     * 
     */
    public void setIsFUI(boolean value) {
        this.isFUI = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierId(UUID value) {
        this.supplierId = value;
    }

}
