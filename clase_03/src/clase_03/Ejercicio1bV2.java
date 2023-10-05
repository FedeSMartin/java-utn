package clase_03;

public class Ejercicio1bV2 {
	
	public static void main(String[] args) {
		
		int number1 = 325;
		int number2 = 84;
		int number3 = 159;
		
		boolean ascendingOrder = true;
		
		int[] createdVector = new int[3];
		

			
		if(ascendingOrder) {
			
			// ordenado de numeros ascendente
			
			if(number1 <= number2 && number2 <= number3) { 
				
				int[] orderedVector = new int[] {number1, number2, number3};
				createdVector = orderedVector;
							
			}else if (number1 >= number2 && number2 >= number3) { 
				
				int[] orderedVector = new int[] {number3, number2, number1};
				createdVector = orderedVector;
				
			}else if (number1 <= number2 && number3 <= number2 && number1 <= number3) { 
													
				
				int[] orderedVector = new int[] {number1, number3, number2};
				createdVector = orderedVector;
				
			}else if (number1 >= number2 && number3 >= number2 && number1 >= number3) { 
													
				
				int[] orderedVector = new int[] {number2, number3, number1};
				createdVector = orderedVector;
							
			}else if (number1 >= number2 && number3 >= number2 && number1 <= number3 ) { 
				
				int[] orderedVector = new int[] {number2, number1, number3};
				createdVector = orderedVector;
				
			}else if (number1 <= number2 && number3 <= number2 && number1 >= number3 ) { 
				
				int[] orderedVector = new int[] {number3, number1, number2};
				createdVector = orderedVector;
			}
			
						
		} else {
			
			// ordenado de numeros descendente
			
			if(number1 <= number2 && number2 <= number3) { 
				
				int[] orderedVector = new int[] {number3, number2, number1};
				createdVector = orderedVector;
							
			}else if (number1 >= number2 && number2 >= number3) { 
				
				int[] orderedVector = new int[] {number1, number2, number3};
				createdVector = orderedVector;
				
			}else if (number1 <= number2 && number3 <= number2 && number1 <= number3) { 
													
				
				int[] orderedVector = new int[] {number2, number3, number1};
				createdVector = orderedVector;
				
			}else if (number1 >= number2 && number3 >= number2 && number1 >= number3) { 
													
				
				int[] orderedVector = new int[] {number1, number3, number2};
				createdVector = orderedVector;
							
			}else if (number1 >= number2 && number3 >= number2 && number1 <= number3 ) { 
				
				int[] orderedVector = new int[] {number3, number1, number2};
				createdVector = orderedVector;
				
			}else if (number1 <= number2 && number3 <= number2 && number1 >= number3 ) { 
				
				int[] orderedVector = new int[] {number2, number1, number3};
				createdVector = orderedVector;
			}
					
		}
		
		// imprimo vector/array
		
		for (int i = 0; i < createdVector.length; i++) {
			System.out.print(createdVector[i]+" ");
		}
				
	}

}
