//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.mgtt.infrastructure.service.external.domain.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RptaListaEnvioCorreos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RptaListaEnvioCorreos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codDetalleReq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correoDestinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RptaListaEnvioCorreos", propOrder = {
    "codDetalleReq",
    "codRetorno",
    "correoDestinatario"
})
public class RptaListaEnvioCorreos {

    @XmlElement(required = true, nillable = true)
    protected String codDetalleReq;
    @XmlElement(required = true, nillable = true)
    protected String codRetorno;
    @XmlElement(required = true, nillable = true)
    protected String correoDestinatario;

    /**
     * Gets the value of the codDetalleReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDetalleReq() {
        return codDetalleReq;
    }

    /**
     * Sets the value of the codDetalleReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDetalleReq(String value) {
        this.codDetalleReq = value;
    }

    /**
     * Gets the value of the codRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRetorno() {
        return codRetorno;
    }

    /**
     * Sets the value of the codRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRetorno(String value) {
        this.codRetorno = value;
    }

    /**
     * Gets the value of the correoDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoDestinatario() {
        return correoDestinatario;
    }

    /**
     * Sets the value of the correoDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoDestinatario(String value) {
        this.correoDestinatario = value;
    }

}
