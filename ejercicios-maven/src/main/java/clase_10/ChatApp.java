package clase_10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ChatApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Escribir mensaje");
            System.out.println("2. Leer mensajes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.print("Escriba su mensaje: ");
                    String mensaje = scanner.nextLine();
                    escribirMensaje(nombre, mensaje);
                    break;

                case 2:
                    leerMensajes();
                    break;

                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private static void escribirMensaje(String nombre, String mensaje) {
        try {
            File file = new File("chat.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(nombre + ": " + mensaje + "\n");
            writer.close();
            System.out.println("Mensaje enviado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir el mensaje en el archivo.");
        }
    }

    private static void leerMensajes() {
        try {
            File file = new File("chat.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("\nMensajes:");

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Error al leer los mensajes del archivo.");
        }
    }
}
