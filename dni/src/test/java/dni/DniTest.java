package dni;

import org.junit.Assert;
import org.junit.Test;

public class DniTest {
	/**
	 * Caso de prueba de DNI correcto
	 */
	@Test
	public void testDniCorrecto() 
	{
		//try {
		char letra = Dni.calculaLetra(53130984);
		Assert.assertEquals('H', letra);
		//}
		/*catch (DniNegativoExcepcion e){

			e.printStackTrace();
		}*/

	}
	
	/**
	 * Caso de prueba de DNI erróneo
	 */
	@Test (expected = DniNegativoExcepcion.class)
	public void testDniNegativo()
	{
		char letra = Dni.calculaLetra(-53130984);
	}
	
	@Test
	public void testDniExtranjeroCorrecto()
	{
		char letra = Dni.calculaLetra("X05334488");
		Assert.assertEquals('Y', letra);
	}
	
	@Test (expected = DniForaneoExcepcion.class)
	public void testDniExtranjeroIncorrecto()
	{
		char letra = Dni.calculaLetra("Y05334488");
	}
}
