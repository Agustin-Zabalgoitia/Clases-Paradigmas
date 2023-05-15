package colecciones;

import java.util.TreeSet;

public class main2 {

	public void main() {
		TreeSet<Integer> arbol = new TreeSet<Integer>();
		System.out.println("esta "+arbol.isEmpty());
		arbol.add(5);
		arbol.add(5);
		arbol.add(3);
		arbol.add(1);
		arbol.add(0);
		System.out.println("contiene el 5?"+arbol.contains(5));;
		arbol.remove(5);
		System.out.println("contiene el 5?"+arbol.contains(5));;
		System.out.println(arbol);
		arbol.clear();
		System.out.println("tamaño "+arbol.size());
	}

}
