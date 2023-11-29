package clase_07;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
	
    private float tope;

    public DescuentoPorcentajeConTope(float porcentaje, float tope) {
    	
        super(porcentaje);
        this.tope = tope;
    }

    @Override
    public float aplicarDescuento(float precio) {
    	
        float descuentoBase = super.aplicarDescuento(precio);
        float descuentoConTope = Math.min(descuentoBase, tope);
        return Math.max(precio - descuentoConTope, 0);
        
    }
}