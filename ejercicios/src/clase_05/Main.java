package clase_05;

import java.io.*;
import java.time.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Producto> productos = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("src/clase_05/productos-compra/productos.txt"))) {

			String line;
			boolean skipFirstLine = true; // Variable para omitir la primera línea

			while ((line = br.readLine()) != null) {

				if (skipFirstLine) {

					skipFirstLine = false;
					continue; // Saltar la primera línea
				}

				String[] parts = line.split("\t");// Cambiar a "," si el archivo está separado por comas

				if (parts.length == 3) {

					String nombre = parts[1]; // El nombre se encuentra en la segunda columna
					String codigo = parts[2]; // El codigo se encuentra en la tercera columna
					float precio = Float.parseFloat(parts[0]); // El precio se encuentra en la primera columna

					Producto producto = new Producto(nombre, codigo, precio);
					productos.add(producto);
				}
			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		Carrito carrito = new Carrito(productos.get(0), productos.get(1), productos.get(2), LocalDateTime.now());
		float costoFinal = carrito.costoFinal();

		System.out.println("Costo final del carrito: " + costoFinal);
	}
}
