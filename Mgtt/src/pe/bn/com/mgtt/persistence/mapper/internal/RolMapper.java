package pe.bn.com.mgtt.persistence.mapper.internal;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import pe.bn.com.mgtt.transversal.dto.sate.Rol;

public interface RolMapper {

	@Select("SELECT * FROM BN_SATE.BNSATE11_ROLES WHERE B11_ID_ROL !=1")
	@ResultMap("mapRol")
	public List<Rol> buscarRoles();

	@Select("SELECT * FROM BN_SATE.BNSATE11_ROLES WHERE B11_ID_ROL = #{idRol}")
	@ResultMap("mapRol")
	public Rol buscarRolPorId(@Param("idRol") Long idRol);
}
