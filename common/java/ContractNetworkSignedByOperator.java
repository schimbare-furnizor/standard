
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;


/**
 * Emis din WebPOSF/platforma Operator cand se semneaza contractul de retea de catre Operator.

 * 				

 * 				Pentru tipul de contract TRANSPORT doar operatorul emite, ceilalti doar iau nota de mesaj.
 * 
 * <p>Java class for ContractNetworkSignedByOperator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractNetworkSignedByOperator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Message">
 *       &lt;sequence>
 *         &lt;element name="contract" type="{http://www.anre.ro/ANRESchema}Contract"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractNetworkSignedByOperator", propOrder = {
    "contract",
    "info"
})
@XmlRootElement(name = "ContractNetworkSignedByOperator")
public class ContractNetworkSignedByOperator
    extends Message
{

    @XmlElement(required = true)
    protected Contract contract;
    protected String info;

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

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

}
