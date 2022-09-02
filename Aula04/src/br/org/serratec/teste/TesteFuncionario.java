package br.org.serratec.teste;

import br.org.serratec.model.Assistente;

public class TesteFuncionario {

	public static void main(String[] args) {
		Assistente a1 = new Assistente("123", "Robs", 10000., "Assistente");
		// System.out.println("Nome: " + a1.getNome() + "\nTipo: " + a1.getTipo());
		System.out.println(a1.aumentoSalario());
	}

}
