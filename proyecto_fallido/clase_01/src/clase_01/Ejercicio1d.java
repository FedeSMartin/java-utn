package clase_01;

public class Ejercicio1d {
	
	// Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden.
	
	public static void main(String[] args) {
		
		int startNumber = 5;
		int endNumber = 14;
		
		
		for (int exchangeNumber = endNumber; exchangeNumber >= startNumber ; exchangeNumber--) {
			
			if (exchangeNumber % 2 == 0) {
				
				System.out.print(exchangeNumber);
				
				if (exchangeNumber > (startNumber + 1)) {
					System.out.print(", ");
				}
			}
		}
	}
}
