//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.mgtt.infrastructure.service.external.domain.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReqListMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReqListMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adjunto" type="{http://bean.open.ws.simm.bn.www}Adjunto"/>
 *         &lt;element name="datosCorreo" type="{http://bean.open.ws.simm.bn.www}DatosCorreo"/>
 *         &lt;element name="datosParametro" type="{http://bean.open.ws.simm.bn.www}DatosParametro"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqListMessage", propOrder = {
    "adjunto",
    "datosCorreo",
    "datosParametro"
})
public class ReqListMessage {

    @XmlElement(required = true, nillable = true)
    protected Adjunto adjunto;
    @XmlElement(required = true, nillable = true)
    protected DatosCorreo datosCorreo;
    @XmlElement(required = true, nillable = true)
    protected DatosParametro datosParametro;

    /**
     * Gets the value of the adjunto property.
     * 
     * @return
     *     possible object is
     *     {@link Adjunto }
     *     
     */
    public Adjunto getAdjunto() {
        return adjunto;
    }

    /**
     * Sets the value of the adjunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjunto }
     *     
     */
    public void setAdjunto(Adjunto value) {
        this.adjunto = value;
    }

    /**
     * Gets the value of the datosCorreo property.
     * 
     * @return
     *     possible object is
     *     {@link DatosCorreo }
     *     
     */
    public DatosCorreo getDatosCorreo() {
        return datosCorreo;
    }

    /**
     * Sets the value of the datosCorreo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCorreo }
     *     
     */
    public void setDatosCorreo(DatosCorreo value) {
        this.datosCorreo = value;
    }

    /**
     * Gets the value of the datosParametro property.
     * 
     * @return
     *     possible object is
     *     {@link DatosParametro }
     *     
     */
    public DatosParametro getDatosParametro() {
        return datosParametro;
    }

    /**
     * Sets the value of the datosParametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosParametro }
     *     
     */
    public void setDatosParametro(DatosParametro value) {
        this.datosParametro = value;
    }

}
