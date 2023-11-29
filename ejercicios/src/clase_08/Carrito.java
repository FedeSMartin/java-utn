package clase_08;

import java.time.LocalDateTime;
import java.util.List;

class Carrito {
	private List<Producto> productos;
    private LocalDateTime fechaCompra;
    private Descuento descuento;
 
    public Carrito(List<Producto> productos, LocalDateTime fechaCompra, Descuento descuento) {
        this.productos = productos;
        this.fechaCompra = fechaCompra;
        this.descuento = descuento; 
    }

    public float costoFinal() throws DescuentoInvalidoException {
        float precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.costoFinal();
        }
        return descuento.aplicarDescuento(precioTotal);
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
    
}
