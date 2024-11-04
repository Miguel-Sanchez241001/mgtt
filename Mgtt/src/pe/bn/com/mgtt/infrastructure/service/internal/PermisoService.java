package pe.bn.com.mgtt.infrastructure.service.internal;

import java.util.List;

import pe.bn.com.mgtt.transversal.dto.sate.Permiso;

public interface PermisoService {

	public List<Permiso> buscarPermisosPorRole(Long idRol);
}
