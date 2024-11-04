package pe.bn.com.mgtt.infrastructure.service.internal;

import pe.bn.com.mgtt.transversal.dto.sate.Empresa;

public interface EmpresaService {

	public Empresa buscarEmpresaPorRUC(String ruc);
	
	public Empresa buscarEmpresaAfiliada(String ruc);
}
