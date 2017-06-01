package dni;

public class Principal {

	public static void main(String[] args) {
		
		char letra;
		try
		{
			//letra = Dni.calculaLetra(-15334488);
			letra = Dni.calculaLetra("X5334488");
			System.out.println("LETRA = " + letra);
		}
		catch (DniNegativoExcepcion e)
		{
			e.printStackTrace();
		}
		
	}

}
