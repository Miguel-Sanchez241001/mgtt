//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.mgtt.infrastructure.service.external.domain.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sendMessageReturn" type="{http://bean.open.ws.simm.bn.www}ResponseMessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sendMessageReturn"
})
@XmlRootElement(name = "sendMessageResponse", namespace = "http://service.open.ws.simm.bn.www")
public class SendMessageResponse {

    @XmlElement(namespace = "http://service.open.ws.simm.bn.www", required = true)
    protected ResponseMessage sendMessageReturn;

    /**
     * Gets the value of the sendMessageReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessage }
     *     
     */
    public ResponseMessage getSendMessageReturn() {
        return sendMessageReturn;
    }

    /**
     * Sets the value of the sendMessageReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessage }
     *     
     */
    public void setSendMessageReturn(ResponseMessage value) {
        this.sendMessageReturn = value;
    }

}
