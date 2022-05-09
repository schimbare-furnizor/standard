//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 09:57:30 AM EEST 
//


package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="supplierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    protected String supplierId;

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
    public String getSupplierId() {
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
    public void setSupplierId(String value) {
        this.supplierId = value;
    }

}
