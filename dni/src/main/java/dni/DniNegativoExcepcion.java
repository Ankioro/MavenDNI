package dni;

//Le agregamos extends para decir que hereda de Exception (una clase propia del JDK
//RuntimeException no me obliga a capturar el error, si es exception si
public class DniNegativoExcepcion extends /*Exception*/ RuntimeException {

	private static final String MENSAJE_ERROR = "No se admiten números negativos";
	
	public DniNegativoExcepcion ()
	{
		//Super llama al padre del constructor (Exception)
		super (MENSAJE_ERROR);
	}
}
