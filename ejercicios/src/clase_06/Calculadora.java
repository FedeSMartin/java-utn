package clase_06;

public class Calculadora {

	public static double sumar(double unNumero, double otroNumero) {
		
		return unNumero + otroNumero;
	}

	public static double restar(double unNumero, double otroNumero) {
		
		return unNumero - otroNumero;
	}

	public static double multiplicar(double unNumero, double otroNumero) {
		
		return unNumero * otroNumero;
	}

	public static double dividir(double unNumero, double otroNumero) {

		if (otroNumero != 0) {

			return unNumero / otroNumero;

		} else {

			return Double.NaN;
			
		}
	}
}
