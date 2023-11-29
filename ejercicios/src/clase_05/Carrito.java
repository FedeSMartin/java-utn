package clase_05;

import java.time.LocalDateTime;

class Carrito {

	private Producto producto1;
	private Producto producto2;
	private Producto producto3;

	private LocalDateTime fechaCompra;

	public Carrito(Producto producto1, Producto producto2, Producto producto3, LocalDateTime fechaCompra) {
		this.producto1 = producto1;
		this.producto2 = producto2;
		this.producto3 = producto3;
		this.fechaCompra = fechaCompra;
	}

	public float costoFinal() {
		return producto1.costoFinal() + producto2.costoFinal() + producto3.costoFinal();
	}

	public Producto getProducto1() {
		return producto1;
	}

	public Producto getProducto2() {
		return producto2;
	}

	public Producto getProducto3() {
		return producto3;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

}
