package clase_08;

public class DescuentoFijo implements Descuento {

	 private float valor;

	    public DescuentoFijo(float valor) {
	        this.valor = valor;
	    }

	    @Override
	    public float aplicarDescuento(float precio) throws DescuentoInvalidoException {
	        if (precio <= 0) {
	            throw new DescuentoInvalidoException("No se puede aplicar descuento a un carrito de precio 0 o menor.");
	        }
	        float resultado = precio - valor;
	        if (resultado < 0) {
	            throw new DescuentoInvalidoException("El descuento resulta en un monto negativo.");
	        }
	        return resultado;
	    }
}

