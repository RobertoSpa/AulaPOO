package br.org.serratec.maps;

import java.util.HashMap;
import java.util.Map;

public class ExemploMaps1 {

	public static void main(String[] args) {
		Map<String, String> estados = new HashMap<>();
		estados.put("AC", "ACRE");
		estados.put("RJ", "RIO");
		estados.put("SP", "SAMPA");
		estados.put("MG", "PAO DE QUEIJO");

		for (String string : estados.keySet()) {
			System.out.println(string);
		}

		for (String string : estados.values()) {
			System.out.println(string);
		}

		for (Map.Entry<String, String> mapa : estados.entrySet()) {
			// System.out.println(mapa.getKey() + "-" + mapa.getValue());
			System.out.println(mapa);
		}
	}

}
