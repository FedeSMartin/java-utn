package clase_05;

import java.time.LocalDateTime;

public class Persona {

	private String nombre;
	private String apellido;
	private LocalDateTime fechaDeNacimiento;

	public Persona(String nombre, String apellido, LocalDateTime fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaNacimiento;
	}

	public int edad() {
		LocalDateTime ahora = LocalDateTime.now();
		return ahora.getYear() - fechaDeNacimiento.getYear();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDateTime getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

}
