package clase_01;

public class Ejercicio2d {
	
	public static void main(String[] args) {
		
		double totalMonthlyIncome = 400000;
		int vehiclesLess5YearsOld = 1;
		int numberOfPropierties = 1;
		boolean luxuryGoods = false;
		
		if(totalMonthlyIncome >= 489083 || vehiclesLess5YearsOld >= 3 || numberOfPropierties >=3 || luxuryGoods == true) {
			
			System.out.println("La persona pertenece al segmento de ingresos altos.");
			
		} else {
			
			System.out.println("La persona pertenece al segmento de ingresos promedios.");
			
		}
		
	}

}
