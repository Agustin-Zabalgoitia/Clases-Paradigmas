package excepciones;

public class cuentaBancaria {

	// Escribir una clase que simule una cuenta bancaria. El programa debe
	// lanzar una excepción si se intenta retirar más dinero del que hay
	// disponible en la cuenta.

	double dinero;

	cuentaBancaria(double dinero) {
		this.dinero = dinero;
	}

	void retirarDinero(double cant) throws Exception {
		if (cant > this.dinero)
			throw new Exception();

		this.dinero -= cant;
	}

}
