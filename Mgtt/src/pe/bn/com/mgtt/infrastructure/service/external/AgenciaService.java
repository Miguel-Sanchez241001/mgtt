package pe.bn.com.mgtt.infrastructure.service.external;

import java.util.List;

import pe.bn.com.mgtt.transversal.dto.tablas.Agencia;

public interface AgenciaService {

	public List<Agencia> buscarAgenciasPorUbigeo(String codDepartamento,
			String codProvincia, String codDistrito);

	public Agencia buscarAgenciaPorCodAgencia(String agencia);
}
