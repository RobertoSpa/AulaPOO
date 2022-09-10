package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("123", "cerresete");
		Empregado empregado2 = new Empregado("123", "cerresete");

		System.out.println(empregado1);
		System.out.println(empregado2);

		if (empregado1.equals(empregado2)) {
			System.out.println("cpg iguais");
		} else {
			System.out.println("cpf diferente");
		}

		if (empregado1.getNome().equals(empregado2.getNome())) {
			System.out.println("nomes iguais");
		}
	}

}
