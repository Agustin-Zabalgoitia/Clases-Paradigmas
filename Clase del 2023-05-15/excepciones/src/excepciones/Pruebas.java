package excepciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pruebas {

	@Test(expected = ArithmeticException.class)
	public void dividirPorCero() {
		Ejercicio1 ej = new Ejercicio1();

		ej.dividir(1, 0);
	}

	@Test(expected = raizNegativaException.class)
	public void raizNegativa() {
		Ejercicio1 ej = new Ejercicio1();

		ej.raiz(-5);
	}

	@Test(expected = Exception.class)
	public void cuentaSinDinero() throws Exception {
		cuentaBancaria cuenta = new cuentaBancaria(0);

		cuenta.retirarDinero(150);
	}
}
