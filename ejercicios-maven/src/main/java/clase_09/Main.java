package clase_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			List<Persona> personas = new ArrayList<>();

			while (true) {
				
			    System.out.println("Ingrese el nombre (o escriba 'fin' para terminar): ");
			    String nombre = scanner.nextLine();

			    if (nombre.equalsIgnoreCase("fin")) {
			    	
			        break;
			    }

			    System.out.println("Ingrese el apellido: ");
			    String apellido = scanner.nextLine();

			    System.out.println("Ingrese la fecha de nacimiento: ");
			    String fechaNacimiento = scanner.nextLine();

			    Persona persona = new Persona();
			    
			    persona.setNombre(nombre);
			    persona.setApellido(apellido);
			    persona.setFechaNacimiento(fechaNacimiento);

			    personas.add(persona);
			}

			System.out.println("\nListado de personas:");

			for (Persona persona : personas) {
				
			    System.out.println("Nombre: " + persona.getNombre());
			    System.out.println("Apellido: " + persona.getApellido());
			    System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
			    System.out.println("----------");
			    
			}
		}
    }
}