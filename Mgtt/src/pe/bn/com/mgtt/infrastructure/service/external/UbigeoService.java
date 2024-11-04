package pe.bn.com.mgtt.infrastructure.service.external;

import java.util.List;

import pe.bn.com.mgtt.transversal.dto.tablas.Ubigeo;

public interface UbigeoService {

	public List<Ubigeo> buscarDepartamentos();

	public List<Ubigeo> buscarProvinciasPorDepartamento(String codDepartamento);

	public List<Ubigeo> buscarDistritosPorProvincia(String codDepartamento,
			String codProvincia);
	
	public Ubigeo buscarLocalidad(String ubigeo,int tipo);
}
