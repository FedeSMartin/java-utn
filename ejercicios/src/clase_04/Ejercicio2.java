package clase_04;

import java.io.*;
import java.util.*;

public class Ejercicio2 {
	
    public static void main(String[] args) {
    	
    	int suma = 0;
    	
        String rutaArchivo = "/numeros.txt";

        try {
        	
            Scanner scanner = new Scanner(new File(rutaArchivo));

            while (scanner.hasNextInt()) {
                suma += scanner.nextInt();
            }

            scanner.close();
            
            System.out.println("La suma de los números en el archivo es: " + suma);
            
        } catch (FileNotFoundException e) {
        	
            System.out.println("El archivo no pudo ser encontrado.");
        }
    }
}

