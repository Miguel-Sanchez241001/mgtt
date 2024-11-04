package pe.bn.com.mgtt.infrastructure.service.internal;

import java.util.List;

import pe.bn.com.mgtt.transversal.dto.sate.Rol;

public interface RolService {

	public List<Rol> buscarRoles();
	
	public Rol buscarRolPorId(long id);
}
