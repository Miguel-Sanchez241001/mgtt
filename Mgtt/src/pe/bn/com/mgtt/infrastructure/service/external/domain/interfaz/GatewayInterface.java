//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.mgtt.infrastructure.service.external.domain.interfaz;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "GatewayInterface", targetNamespace = "http://interfaz.service.bn.pe")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GatewayInterface {


    /**
     * 
     * @param request
     * @return
     *     returns pe.bn.com.mgtt.transversal.ws.interfaz.ResponseGateway
     */
    @WebMethod
    @WebResult(name = "enviarTramaConsultaReturn", targetNamespace = "")
    @RequestWrapper(localName = "enviarTramaConsulta", targetNamespace = "http://interfaz.service.bn.pe", className = "pe.bn.com.mgtt.transversal.ws.interfaz.EnviarTramaConsulta")
    @ResponseWrapper(localName = "enviarTramaConsultaResponse", targetNamespace = "http://interfaz.service.bn.pe", className = "pe.bn.com.mgtt.transversal.ws.interfaz.EnviarTramaConsultaResponse")
    public ResponseGateway enviarTramaConsulta(
        @WebParam(name = "request", targetNamespace = "")
        RequestGateway request);

}
