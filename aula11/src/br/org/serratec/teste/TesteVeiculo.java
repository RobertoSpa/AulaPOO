package br.org.serratec.teste;

import java.util.HashMap;
import java.util.Map;

public class TesteVeiculo {

	public static void main(String[] args) {
		Map<String, String> carros = new HashMap<>();

		carros.put("honda", "civic");
		carros.put("fiat", "uno");
		carros.put("volks", "voyage");

		for (Map.Entry<String, String> carro : carros.entrySet()) {
			System.out.println(carro);

		}

	}

}
