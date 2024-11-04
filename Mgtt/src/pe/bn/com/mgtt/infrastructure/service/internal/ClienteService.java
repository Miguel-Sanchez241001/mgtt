package pe.bn.com.mgtt.infrastructure.service.internal;

import pe.bn.com.mgtt.transversal.dto.sate.Cliente;


public interface ClienteService {

	public Cliente buscarCliente(String tipoDocumento,String numDocumento);
	
	public void actualizarCliente(Cliente cliente);
}
