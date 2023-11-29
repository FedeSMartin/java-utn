package clase_08;

import java.io.*; 
import java.time.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws DescuentoInvalidoException {

		List<Producto> productos = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("src/clase_07/productos-compra/productos.txt"))) {

			String line;
			boolean skipFirstLine = true;
			while ((line = br.readLine()) != null) {

				if (skipFirstLine) {
					
					skipFirstLine = false;
					continue;
				}

				String[] parts = line.split("\t");

				if (parts.length == 3) {

					String nombre = parts[1]; 
					String codigo = parts[2];
					float precio = Float.parseFloat(parts[0]);

					Producto producto = new Producto(nombre, codigo, precio);
					productos.add(producto);
				}
			}
			
		} catch (IOException e){

			e.printStackTrace();

		}

		  Descuento descuento = new DescuentoPorcentaje(15);
	        Carrito carrito = new Carrito(productos, LocalDateTime.now(), descuento);
	        float costoFinal = carrito.costoFinal();
	        System.out.println("Costo final del carrito: " + costoFinal);
	}
}

