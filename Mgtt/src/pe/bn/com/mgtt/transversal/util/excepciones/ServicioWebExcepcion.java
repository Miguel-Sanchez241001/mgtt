package pe.bn.com.mgtt.transversal.util.excepciones;

public class ServicioWebExcepcion extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServicioWebExcepcion() {
        
    }
	public ServicioWebExcepcion(String message) {
        super(message);
    }

	public ServicioWebExcepcion(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
}
