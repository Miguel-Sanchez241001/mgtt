package pe.bn.com.mgtt.infrastructure.service.internal;

import pe.bn.com.mgtt.transversal.dto.sate.Usuario;

public interface UsuarioService {

	public Usuario buscarUsuario(String tipoDocumento, String numDocumento);

	public Usuario buscarUsuarioSinRepresentante(String tipoDocumento,
			String numDocumento);

	public void registrarUsuario(Usuario usuario);

	public boolean existeUsuarioEmpresa(Usuario usuario, String ruc);
	
	public void actualizaDatosUsuario(Usuario usuario);
}
