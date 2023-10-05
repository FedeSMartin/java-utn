package clase_03;

public class Ejercicio1c {
	public static void main(String[] args) {
		
		int[] vectorCualquiera = new int[] {20, 200, 55, 128, 34};
		
		int numeroCualquiera = 58;
		
		int numerosSumados = 0;
		
		for (int i = 0; i < vectorCualquiera.length; i++) {
						
			if(vectorCualquiera[i] > numeroCualquiera) {
				numerosSumados += vectorCualquiera[i];
			}
					
		}
		
		System.out.println("La suma total es: " + numerosSumados);

	}
}
