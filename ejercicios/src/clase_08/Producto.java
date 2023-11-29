package clase_08;

public class Producto {
	
	private String nombre;
	private String codigo;
	private float precio;
	
	public Producto(String nombre, String codigo, float precio) {
		
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		 
	}
	
	public float costoFinal() {
        return precio;
    }

	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public float getPrecio() {
		return precio;
	}
	
}
