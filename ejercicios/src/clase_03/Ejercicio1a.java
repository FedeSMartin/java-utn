package clase_03;

public class Ejercicio1a {
	
	public static void main(String[] args) {
		
		String word = "casablanca";
		char oneLetter = 'a';
		int howManiLetters = 0;
		
		for (int i = 0; i < word.length(); i++) {
					
			if (word.charAt(i) == oneLetter) {
				howManiLetters++;
			}
			
		}
		
		System.out.println("La palabra '"+ word + "' contiene la letra '"+ oneLetter+ "' " + howManiLetters + " veces.");
		
	}
}