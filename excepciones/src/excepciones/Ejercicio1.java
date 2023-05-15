package excepciones;

import java.util.function.Function;

public class Ejercicio1 {
	// Escribir una funci�n que calcule la divisi�n de dos n�meros enteros, pero
	// que lance una excepci�n del tipo ArithmeticException si el segundo n�mero
	// es cero.

	double dividir(int a, int b)  {

		if (b <= 0)
			throw new ArithmeticException();

		return a / b;
	}

	/*
	 * Definir su propia excepci�n y utilizarla en un programa que posea una
	 * funci�n que lance dicha excepci�n si se intenta calcular la raiz cuadrada
	 * de un n�mero negativo. Esta excepci�n deber� extender de Exception en
	 * forma directa.
	 */
	
	double raiz(int a) throws raizNegativaException{
		if(a < 0){
			throw new raizNegativaException();
		}
		
		return Math.sqrt(a);
	}
}
