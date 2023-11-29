package clase_07;

public class DescuentoPorcentaje implements Descuento {
    private float porcentaje;

    public DescuentoPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public float aplicarDescuento(float precio) {
        return precio * (1 - porcentaje / 100);
    }
}
