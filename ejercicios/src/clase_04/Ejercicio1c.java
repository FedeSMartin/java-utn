package clase_04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1c {

	// ########## EJERCICIO 1C ##########

	public static void main(String[] args) {

		Integer num1 = null;
		Integer num2 = null;
		Integer num3 = null;
		String orden = null;

		Scanner datosEntrada = new Scanner(System.in);

		if (num1 == null || num2 == null || num3 == null || orden.equals(null)) {

			System.out.println(
					"Programa para ordenar una secuencia de 3 numeros enteros, de forma ascendente o descendente.");
			System.out.println("Presione Enter para continuar...");
			datosEntrada.nextLine();

			System.out.print("Primer número entero: ");
			num1 = datosEntrada.nextInt();
			datosEntrada.nextLine();

			System.out.print("Segundo número entero: ");
			num2 = datosEntrada.nextInt();
			datosEntrada.nextLine();

			System.out.print("Tercer número entero: ");
			num3 = datosEntrada.nextInt();
			datosEntrada.nextLine();

			System.out.print("Introduzca letra 'a' para ascendente o 'd' para descendente: ");
			orden = datosEntrada.next();

			Integer[] numeros = { num1, num2, num3 };

			if (orden.equalsIgnoreCase("a")) {

				Arrays.sort(numeros);

			} else if (orden.equalsIgnoreCase("d")) {

				Arrays.sort(numeros);

				Integer temp = numeros[0];

				numeros[0] = numeros[2];

				numeros[2] = temp;
			} else {

				System.out.println("Debe ingresar la letra 'a' o 'd'");
			}

		}

		Integer[] numeros = { num1, num2, num3 };

		if (orden.equalsIgnoreCase("a")) {

			Arrays.sort(numeros);

		} else if (orden.equalsIgnoreCase("d")) {

			Arrays.sort(numeros);

			Integer temp = numeros[0];

			numeros[0] = numeros[2];

			numeros[2] = temp;
		}

		String organizado = " ";

		if (orden.equalsIgnoreCase("a")) {

			organizado = "ascendente";

		} else if (orden.equalsIgnoreCase("d")) {

			organizado = "descendente";
		}

		System.out.println("Números ordenados de forma " + organizado + ":");
		for (int numero : numeros) {
			System.out.println(numero);

		}

	}

}
