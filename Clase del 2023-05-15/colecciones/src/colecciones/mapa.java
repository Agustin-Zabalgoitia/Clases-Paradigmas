package colecciones;

import java.util.HashMap;

public class mapa {
	HashMap<String, Integer> mapa = new HashMap<>();

	public void ejer() {
		mapa.put("a", 123);
		mapa.put("a", 456);
		mapa.put("b", 23);
		mapa.put("c", -123);
		mapa.put("d", 12);
		mapa.put("otra clave mas", 35741);
		System.out.println(mapa.get("a"));
		System.out.println(mapa.get("d"));
		System.out.println(mapa.get("c"));
	}

}
