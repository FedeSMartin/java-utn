package clase_06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	@Test
	void multiplicarTest() {
		assertEquals(Calculadora.multiplicar(80,3), 240);
	}
	
	@Test
	void sumarYDividirTest() {
		double suma = Calculadora.sumar(150, 180);
		assertEquals(Calculadora.dividir(suma, 3), 110);
	}
	
	@Test
	void restarYMultiplicarTest() {
		double resta = Calculadora.restar(90, 50);
		assertNotEquals(Calculadora.multiplicar(resta, 15), 605);
	}
	
	@Test
	void sumarYMultiplicarTest() {
		double suma = Calculadora.sumar(70, 40);
		assertNotEquals(Calculadora.multiplicar(suma, 25), 2700);
	}

}
