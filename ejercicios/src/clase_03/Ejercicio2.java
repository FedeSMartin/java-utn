package clase_03;

public class Ejercicio2 {
	
	//ejercicio 2

	public static void main(String[] args) {

		String texto = "mtpf vzj yfp, htqt jxyfx?";
		int desplazamiento = 5;
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String metodoEncriptacion = "decodificar";

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
			String mensajeCodificado = resultado.toString();
			System.out.println("Mensaje codificado: " + mensajeCodificado);

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
			String mensajeCodificado = resultado.toString();
			System.out.println("Mensaje decodificado: " + mensajeCodificado);

		}

	}

}