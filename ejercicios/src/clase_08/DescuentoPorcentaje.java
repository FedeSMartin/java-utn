package clase_08;

public class DescuentoPorcentaje implements Descuento {
	
    private float porcentaje;

    public DescuentoPorcentaje(float porcentaje) {
    	
        this.porcentaje = porcentaje;
    }

    @Override
    public float aplicarDescuento(float precio) throws DescuentoInvalidoException {
    	
        if (precio <= 0) {
        	
            throw new DescuentoInvalidoException("No se puede aplicar descuento a un carrito de precio 0 o menor.");
        }
        
        float resultado = precio * (1 - porcentaje / 100);
        
        if (resultado < 0) {
        	
            throw new DescuentoInvalidoException("El descuento resulta en un monto negativo.");
        }
        
        return resultado;
    }
}
