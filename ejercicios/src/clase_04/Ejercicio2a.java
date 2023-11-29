package clase_04;

import java.io.*;
import java.util.*;

public class Ejercicio2a {
	
    public static void main(String[] args) {
    	
    	int num = 0;
    	String operacion = "m"; // 'm' para multiplicacion y 's' para suma 
    	
        String rutaArchivo = "/numeros.txt";

        try {
        	
            Scanner scanner = new Scanner(new File(rutaArchivo));
               	
            	if(operacion.equals("m")) {
            		
            		num = 1;
            		
            		while (scanner.hasNextInt()) {
            		
            			num *= scanner.nextInt();
            		}
            		
            	}else if(operacion.equalsIgnoreCase("s")) {
            		
            	    while (scanner.hasNextInt()) {
            		            		
            	    	num += scanner.nextInt();
            	    }
                
            	} else {
            		
            		System.out.println("solo funciona con letra 'm' para multiplicacion o 's' para suma");
            	}


            scanner.close();
            
            if(operacion.equalsIgnoreCase("m")) {
            
            	System.out.println("La multiplicacion de los números en el archivo es: " + num);
            
            }else if(operacion.equalsIgnoreCase("s")) {
            	System.out.println("La suma de los números en el archivo es: " + num);
            }
            
        } catch (FileNotFoundException e) {
        	
            System.out.println("El archivo no pudo ser encontrado.");
        }
    }
}


