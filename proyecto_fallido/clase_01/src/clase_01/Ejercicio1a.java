package clase_01;

public class Ejercicio1a {
	
/*		Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
		y “b”.Su código puede arrancar (por ejemplo):
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		Se deberían mostrar los números:
		
		5,6,7,8,9,10,11,12,13,14
 */
	
	public static void main(String[] args) {
		
		int startNumber = 5;
		int endNumber = 14;
		int exchangeNumber = startNumber;
		
		while (exchangeNumber <= endNumber ) {
			
			System.out.print(exchangeNumber);
			
			if (exchangeNumber < endNumber) {
				System.out.print(", ");
			}
			
			exchangeNumber++;
			
		}
		
	}

}
