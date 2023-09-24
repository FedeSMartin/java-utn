package clase_01;

public class Ejercicio1c {
	
	// A lo anterior, con una variable extra, elija si se deben mostrar los números
	// pares o impares.
	
	public static void main(String[] args) {
		
		int startNumber = 5;
		int endNumber = 14;
		int exchangeNumber = startNumber;
		boolean isEven = false;
		int remainder = 0;
		
		while (exchangeNumber <= endNumber ) {
			
			if (isEven) {
				remainder = 0;
			}else if (exchangeNumber < 0) {
				remainder = -1;
			}else {
				remainder = 1;
			}
			
			if (exchangeNumber % 2 == remainder) {
				
				System.out.print(exchangeNumber);
				
				if (exchangeNumber < (endNumber - 1)) {
					System.out.print(", ");
				}
			}
			
			exchangeNumber++;
		}
	}

}
