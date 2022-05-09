//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 03:53:13 PM EEST 
//


package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.*;


/**
 * Coordinates must be in accordance

 * 				with WGS84 and must use an ISO 6709 format as follows: [+/-]NN.NNNNNN.
 * 
 * <p>Java class for Position complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="geohash" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position")
@XmlRootElement(name = "Position")
public class Position {

    @XmlAttribute(name = "geohash")
    protected String geohash;
    @XmlAttribute(name = "latitude")
    protected String latitude;
    @XmlAttribute(name = "longitude")
    protected String longitude;

    /**
     * Gets the value of the geohash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeohash() {
        return geohash;
    }

    /**
     * Sets the value of the geohash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeohash(String value) {
        this.geohash = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

}
