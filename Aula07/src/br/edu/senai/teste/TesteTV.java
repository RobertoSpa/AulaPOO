package br.edu.senai.teste;

import br.edu.senai.enums.MarcaTV;
import br.edu.senai.model.TV;

public class TesteTV {

	public static void main(String[] args) {
		TV tv = new TV("213", 42., MarcaTV.PHILCO);
		System.out.println(tv);
	}

}
