package clase_08;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
	
    private float tope;

    public DescuentoPorcentajeConTope(float porcentaje, float tope) {
    	
        super(porcentaje);
        this.tope = tope;
    }

    @Override
    public float aplicarDescuento(float precio) throws DescuentoInvalidoException {
    	
        if (precio <= 0) {
        	
            throw new DescuentoInvalidoException("No se puede aplicar descuento a un carrito de precio 0 o menor.");
        }
        
        float descuentoBase = super.aplicarDescuento(precio);
        float descuentoConTope = Math.min(descuentoBase, tope);
        float resultado = Math.max(precio - descuentoConTope, 0);
        
        if (resultado < 0) {
        	
            throw new DescuentoInvalidoException("El descuento resulta en un monto negativo.");
        }
        
        return resultado;
    }
}