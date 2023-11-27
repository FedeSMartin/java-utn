package clase_01;

public class Ejercicio1b {
	
	// A lo anterior,solo muestre los númerospares.
	
	public static void main(String[] args) {
		
		int startNumber = 5;
		int endNumber = 14;
		int exchangeNumber = startNumber;
		
		while (exchangeNumber <= endNumber ) {
			
			if (exchangeNumber % 2 == 0) {
				
				System.out.print(exchangeNumber);
				
				if (exchangeNumber < endNumber) {
					System.out.print(", ");
				}
			}
			
			exchangeNumber++;
		}
	}
}
