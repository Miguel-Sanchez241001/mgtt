//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.mgtt.infrastructure.service.external.domain.comp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parametro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parametro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aliasParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="campoParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcionParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parametro", propOrder = {
    "aliasParam",
    "campoParam",
    "descripcionParam",
    "tipoParam",
    "valorParam"
})
public class Parametro {

    @XmlElement(required = true, nillable = true)
    protected String aliasParam;
    @XmlElement(required = true, nillable = true)
    protected String campoParam;
    @XmlElement(required = true, nillable = true)
    protected String descripcionParam;
    @XmlElement(required = true, nillable = true)
    protected String tipoParam;
    @XmlElement(required = true, nillable = true)
    protected String valorParam;

    /**
     * Gets the value of the aliasParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasParam() {
        return aliasParam;
    }

    /**
     * Sets the value of the aliasParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasParam(String value) {
        this.aliasParam = value;
    }

    /**
     * Gets the value of the campoParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoParam() {
        return campoParam;
    }

    /**
     * Sets the value of the campoParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoParam(String value) {
        this.campoParam = value;
    }

    /**
     * Gets the value of the descripcionParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionParam() {
        return descripcionParam;
    }

    /**
     * Sets the value of the descripcionParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionParam(String value) {
        this.descripcionParam = value;
    }

    /**
     * Gets the value of the tipoParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoParam() {
        return tipoParam;
    }

    /**
     * Sets the value of the tipoParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoParam(String value) {
        this.tipoParam = value;
    }

    /**
     * Gets the value of the valorParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorParam() {
        return valorParam;
    }

    /**
     * Sets the value of the valorParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorParam(String value) {
        this.valorParam = value;
    }

}
