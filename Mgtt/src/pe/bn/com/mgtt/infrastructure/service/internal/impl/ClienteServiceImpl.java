package pe.bn.com.mgtt.infrastructure.service.internal.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bn.com.mgtt.infrastructure.exception.InternalServiceException;
import pe.bn.com.mgtt.infrastructure.service.internal.ClienteService;
import pe.bn.com.mgtt.persistence.mapper.internal.ClienteMapper;
import pe.bn.com.mgtt.transversal.dto.sate.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	private @Autowired
	ClienteMapper clienteMapper;

	@Override
	public Cliente buscarCliente(String tipoDocumento, String numDocumento) {
		try {
			return clienteMapper.buscarCliente(tipoDocumento, numDocumento);
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		try {
			clienteMapper.actualizarCliente(cliente);
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

}
