package dni;

//Le agregamos extends para decir que hereda de Exception (una clase propia del JDK
//RuntimeException no me obliga a capturar el error, si es exception si
public class DniForaneoExcepcion extends /*Exception*/ RuntimeException {

	private static final String MENSAJE_ERROR = "Formato DNI extranjero X seguido de números";
	
	public DniForaneoExcepcion ()
	{
		//Super llama al padre del constructor (Exception)
		super (MENSAJE_ERROR);
	}
}
