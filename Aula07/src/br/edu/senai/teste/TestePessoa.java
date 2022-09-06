package br.edu.senai.teste;

import br.edu.senai.enums.EstadoCivil;
import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Setor;

public class TestePessoa {

	public static void main(String[] args) {
		Setor s = new Setor(10, "vendas");
		Setor s2 = new Setor(20, "RH");

		Pessoa p = new Pessoa("robs", "12345678", "roberto@email", EstadoCivil.SOLTEIRO, s);

		// System.out.println(p);

		for (EstadoCivil batata : EstadoCivil.values()) {
			System.out.println(batata);
		}
	}

}
