
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;


/**
 * Client
 * 
 * <p>Java class for Client complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Client">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aggregates" type="{http://www.anre.ro/ANRESchema}Company" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.anre.ro/ANRESchema}Company" minOccurs="0"/>
 *         &lt;element name="isAgregate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isPre" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="person" type="{http://www.anre.ro/ANRESchema}Person"/>
 *         &lt;element name="preCompany" type="{http://www.anre.ro/ANRESchema}Company"/>
 *         &lt;element name="prosumer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="uninterruptible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vulnerable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Client", propOrder = {
    "aggregates",
    "company",
    "isAgregate",
    "isPre",
    "person",
    "preCompany",
    "prosumer",
    "uninterruptible",
    "vulnerable"
})
@XmlRootElement(name = "Client")
public class Client {

    protected Company aggregates;
    protected Company company;
    protected boolean isAgregate;
    protected boolean isPre;
    @XmlElement(required = true)
    protected Person person;
    @XmlElement(required = true)
    protected Company preCompany;
    protected boolean prosumer;
    protected boolean uninterruptible;
    protected boolean vulnerable;

    /**
     * Gets the value of the aggregates property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getAggregates() {
        return aggregates;
    }

    /**
     * Sets the value of the aggregates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setAggregates(Company value) {
        this.aggregates = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompany(Company value) {
        this.company = value;
    }

    /**
     * Gets the value of the isAgregate property.
     * 
     */
    public boolean isIsAgregate() {
        return isAgregate;
    }

    /**
     * Sets the value of the isAgregate property.
     * 
     */
    public void setIsAgregate(boolean value) {
        this.isAgregate = value;
    }

    /**
     * Gets the value of the isPre property.
     * 
     */
    public boolean isIsPre() {
        return isPre;
    }

    /**
     * Sets the value of the isPre property.
     * 
     */
    public void setIsPre(boolean value) {
        this.isPre = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the preCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getPreCompany() {
        return preCompany;
    }

    /**
     * Sets the value of the preCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setPreCompany(Company value) {
        this.preCompany = value;
    }

    /**
     * Gets the value of the prosumer property.
     * 
     */
    public boolean isProsumer() {
        return prosumer;
    }

    /**
     * Sets the value of the prosumer property.
     * 
     */
    public void setProsumer(boolean value) {
        this.prosumer = value;
    }

    /**
     * Gets the value of the uninterruptible property.
     * 
     */
    public boolean isUninterruptible() {
        return uninterruptible;
    }

    /**
     * Sets the value of the uninterruptible property.
     * 
     */
    public void setUninterruptible(boolean value) {
        this.uninterruptible = value;
    }

    /**
     * Gets the value of the vulnerable property.
     * 
     */
    public boolean isVulnerable() {
        return vulnerable;
    }

    /**
     * Sets the value of the vulnerable property.
     * 
     */
    public void setVulnerable(boolean value) {
        this.vulnerable = value;
    }

}