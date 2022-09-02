package br.org.serratec.teste;

import br.org.serratec.model.Amador;

public class TesteAtleta {

	public static void main(String[] args) {
		Amador amador = new Amador("jailson", "H", 18, 1.7, true);

		System.out.println(amador.toString());
		System.out.println(amador.podeCompetir());

	}

}
