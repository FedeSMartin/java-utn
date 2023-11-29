package clase_07;

public class DescuentoFijo implements Descuento {
	
	private float valor;

    public DescuentoFijo(float valor) {
        this.valor = valor;
    }

    public float aplicarDescuento(float precio) {
        return precio - valor;
    }

}
