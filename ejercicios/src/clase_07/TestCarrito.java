package clase_07;

import static org.junit.jupiter.api.Assertions.*;
 
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TestCarrito {
	
	 @Test
	    public void testPrecio1() {
	    	
	    	Producto producto1 = new Producto("Producto1", "001", 10.0f);
	        Producto producto2 = new Producto("Producto2", "002", 5.0f);
	        Producto producto3 = new Producto("Producto3", "003", 150.0f);
	        Descuento descuento = new DescuentoFijo(0.0f);
	        LocalDateTime fechaCompra = LocalDateTime.now();
	        Carrito carrito = new Carrito(producto1, producto2, producto3, fechaCompra, descuento);


	        float resultado = carrito.costoFinal();


	        assertEquals(165.0f, resultado, 0.001);
	    }
	 
	 @Test
	    public void testPrecio2() {
	    	
	    	Producto producto1 = new Producto("Producto4", "004", 100.0f);
	        Producto producto2 = new Producto("Producto5", "005", 52.0f);
	        Producto producto3 = new Producto("Producto6", "006", 180.0f);
	        Descuento descuento = new DescuentoFijo(0.0f);
	        LocalDateTime fechaCompra = LocalDateTime.now();
	        Carrito carrito = new Carrito(producto1, producto2, producto3, fechaCompra, descuento);


	        float resultado = carrito.costoFinal();


	        assertNotEquals(300.0f, resultado, 0.001);
	    }
	
	@Test
    public void testCostoFinalDescuentoFijo() {

        Producto producto1 = new Producto("Producto1", "001", 20.0f);
        Producto producto2 = new Producto("Producto2", "002", 30.0f);
        Producto producto3 = new Producto("Producto3", "003", 25.0f);
        //Con descuento fijo
        Descuento descuento = new DescuentoFijo(5.0f);
        LocalDateTime fechaCompra = LocalDateTime.now();
        Carrito carrito = new Carrito(producto1, producto2, producto3, fechaCompra, descuento);


        float resultado = carrito.costoFinal();


        assertEquals(70f, resultado, 0.001);
    }

    @Test
    public void testCostoFinalConDescuentoPorPorcentaje() {

        Producto producto1 = new Producto("Producto1", "001", 20.0f);
        Producto producto2 = new Producto("Producto2", "002", 30.0f);
        Producto producto3 = new Producto("Producto3", "003", 25.0f);
        //Descuento con porcentaje
        Descuento descuento = new DescuentoPorcentaje(10.0f);
        LocalDateTime fechaCompra = LocalDateTime.now();
        Carrito carrito = new Carrito(producto1, producto2, producto3, fechaCompra, descuento);


        float resultado = carrito.costoFinal();
        
        assertEquals(67.5f, resultado, 0.001);
    }
    
    @Test
    public void testCostoFinalConDescuentoConTope() {
    	
        Producto producto1 = new Producto("Producto1", "001", 205.0f);
        Producto producto2 = new Producto("Producto2", "002", 630.0f);
        Producto producto3 = new Producto("Producto3", "003", 250.0f);
        // Descuento con porcentaje con tope
        Descuento descuento = new DescuentoPorcentajeConTope(20.0f, 100.0f);
        LocalDateTime fechaCompra = LocalDateTime.now();
        Carrito carrito = new Carrito(producto1, producto2, producto3, fechaCompra, descuento);

        float resultado = carrito.costoFinal();

        assertEquals(985.0f, resultado, 0.001);

    }
    
}
