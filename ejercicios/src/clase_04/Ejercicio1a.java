package clase_04;

import java.util.*;

public class Ejercicio1a {
	
	//########## EJERCICIO 1A ##########
	
		public static void main(String[] args) {
			
			int num1 = 888;
			int num2 = 150; 
			int num3 = 433;
			String orden = "a"; // "a" para ascendente
								// "d" para descendente
			
		        int[] numeros = {num1, num2, num3};
		        
		        if (orden.equalsIgnoreCase("a")) {
		        	
		            Arrays.sort(numeros);
		            
		        } else if (orden.equalsIgnoreCase("d")) {
		            
		        	Arrays.sort(numeros);
		            
		            int temp = numeros[0];
		            
		            numeros[0] = numeros[2];
		            
		            numeros[2] = temp;
		        }
		        
		        String organizado = " ";
		        
		        if (orden.equalsIgnoreCase("a")) {
		        	
		        	organizado = "ascendente";
		        	
		        } else if(orden.equalsIgnoreCase("d")) {
		        	
		        	organizado = "descendente";
		        }
		        
		        
		        System.out.println("Números ordenados de forma " + organizado + ":");
			    for (int numero : numeros) {
			        System.out.println(numero);
			        
			    }
		}

	}