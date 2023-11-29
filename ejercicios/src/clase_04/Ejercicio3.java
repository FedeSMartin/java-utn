package clase_04;

import java.io.*;

public class Ejercicio3 {

	public static void main(String[] args) {

		String metodoEncriptacion = "codificar";
		int desplazamiento = 3;
		String archivoEntrada = "src/clase_04/txt-input/entrada.txt";
		String archivoSalida = "src/clase_04/txt-output/salida.txt";

		try {
			BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada));
			BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida));

			StringBuilder texto = new StringBuilder();
			String linea;
			while ((linea = lector.readLine()) != null) {
				texto.append(linea).append("\n");
			}

			String resultado = realizarEncriptacion(texto.toString(), desplazamiento, metodoEncriptacion);

			escritor.write(resultado);
			escritor.close();
			lector.close();

			System.out.println("Proceso completado correctamente.");

		} catch (IOException e) {
			System.out.println("Error de entrada/salida: " + e.getMessage());
		}
	}

	private static String realizarEncriptacion(String texto, int desplazamiento, String metodoEncriptacion) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		StringBuilder resultado = new StringBuilder();

		if (metodoEncriptacion.equals("codificar")) {
			for (int i = 0; i < texto.length(); i++) {
				char caracter = texto.charAt(i);
				int indice = abecedario.indexOf(caracter);

				if (indice != -1) {
					int nuevoIndice = (indice + desplazamiento) % abecedario.length();
					char nuevoCaracter = abecedario.charAt(nuevoIndice);
					resultado.append(nuevoCaracter);
				} else {
					resultado.append(caracter);
				}
			}
		} else if (metodoEncriptacion.equals("decodificar")) {
			desplazamiento = desplazamiento * -1;

			for (int i = 0; i < texto.length(); i++) {
				char caracter = texto.charAt(i);
				int indice = abecedario.indexOf(caracter);

				if (indice != -1) {
					int nuevoIndice = (indice + desplazamiento + abecedario.length()) % abecedario.length();
					char nuevoCaracter = abecedario.charAt(nuevoIndice);
					resultado.append(nuevoCaracter);
				} else {
					resultado.append(caracter);
				}
			}
		}

		return resultado.toString();
	}
}
