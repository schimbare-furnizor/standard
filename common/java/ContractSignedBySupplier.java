//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.09 at 03:53:13 PM EEST 
//


package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.*;


/**
 * Instiintare despre contract semnat de furnizor, dupa ce a semnat in prealabil si clientul fie la ghiseu fie prin aplicatia furnizorului.

 * 				Se emite si cand furnizorul deruleaza procesul de semnare in afara platformei POSF, doar cand contractul a fost semnat semnat de ambele parti.
 * 
 * <p>Java class for ContractSignedBySupplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractSignedBySupplier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Message">
 *       &lt;sequence>
 *         &lt;element name="contract" type="{http://www.anre.ro/ANRESchema}Contract"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractSignedBySupplier", propOrder = {
    "contract"
})
@XmlRootElement(name = "ContractSignedBySupplier")
public class ContractSignedBySupplier
    extends Message
{

    @XmlElement(required = true)
    protected Contract contract;

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
    }

}
