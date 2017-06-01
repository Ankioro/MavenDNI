package dni;

public class Dni {

	// final es una constante, queda mejor a nivel de programacion.
	// las constantes en java siempre deben ser escritas en mayusculas (por
	// convencion)
	// Es necesario agregar public o private, ya que por defecto es package
	// prtoected,
	// es decir, solo se podria acceder a el dentro del mismo paquete de datos.
	// Ademas
	// es necesario static ya que no va a variar el objeto.
	private static final String JUEGO_CARACTERES_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	private static final int NUM_LETRAS = 23;

	/**
	 * Este método recibe un número mayor que 0 y devuelve la letra DNI
	 * asociada.
	 * 
	 * @param dni
	 *            el número de DNI que recibimos.
	 * @return y la letra asociada a ese DNI.
	 * @throws DniNegativoExcepcion
	 */
	public static char calculaLetra(int dni) throws DniNegativoExcepcion {
		char letraCalculada = ' ';
		int modulo = -1;

		if (dni < 0) {
			throw new DniNegativoExcepcion();
		} else {
			modulo = (dni % NUM_LETRAS);
			letraCalculada = JUEGO_CARACTERES_DNI.charAt(modulo);
		}

		return letraCalculada;

		/*
		 * String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE"; int modulo= dni %
		 * 23; char letra = juegoCaracteres.charAt(modulo); return letra;
		 */
	}

	public static char calculaLetra(String dniExtranjero) {
		char letraCalculada = ' ';
		char primeraLetra = ' ';
		String  dniSinEquis = null;
		int numDni = -5;
		
			primeraLetra = dniExtranjero.charAt(0);
			if(primeraLetra != 'X')
			{
				//En este caso no es necesario incluir el throws en el metodo, ya que 
				//es una excepcion del tipo RunTimeException
				throw new DniForaneoExcepcion();
			}
			dniSinEquis = dniExtranjero.substring(1);
			numDni = Integer.parseInt(dniSinEquis);
			letraCalculada = calculaLetra(numDni);

		return letraCalculada;
	}
}
