//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.mgtt.infrastructure.service.external.domain.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRequermiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reqListMessage" type="{http://service.open.ws.simm.bn.www}ArrayOf_tns1_ReqListMessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessage", propOrder = {
    "codRequermiento",
    "reqListMessage"
})
public class RequestMessage {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer codRequermiento;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns1ReqListMessage reqListMessage;

    /**
     * Gets the value of the codRequermiento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodRequermiento() {
        return codRequermiento;
    }

    /**
     * Sets the value of the codRequermiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodRequermiento(Integer value) {
        this.codRequermiento = value;
    }

    /**
     * Gets the value of the reqListMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns1ReqListMessage }
     *     
     */
    public ArrayOfTns1ReqListMessage getReqListMessage() {
        return reqListMessage;
    }

    /**
     * Sets the value of the reqListMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns1ReqListMessage }
     *     
     */
    public void setReqListMessage(ArrayOfTns1ReqListMessage value) {
        this.reqListMessage = value;
    }

}
