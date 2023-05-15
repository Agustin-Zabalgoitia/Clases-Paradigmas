package excepciones;

import java.util.function.Function;

public class Ejercicio1 {
	// Escribir una función que calcule la división de dos números enteros, pero
	// que lance una excepción del tipo ArithmeticException si el segundo número
	// es cero.

	double dividir(int a, int b)  {

		if (b <= 0)
			throw new ArithmeticException();

		return a / b;
	}

	/*
	 * Definir su propia excepción y utilizarla en un programa que posea una
	 * función que lance dicha excepción si se intenta calcular la raiz cuadrada
	 * de un número negativo. Esta excepción deberá extender de Exception en
	 * forma directa.
	 */
	
	double raiz(int a) throws raizNegativaException{
		if(a < 0){
			throw new raizNegativaException();
		}
		
		return Math.sqrt(a);
	}
}
