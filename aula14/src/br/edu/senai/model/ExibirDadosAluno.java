package br.edu.senai.model;

import java.util.function.Consumer;

public class ExibirDadosAluno implements Consumer<Aluno> {

	@Override
	public void accept(Aluno t) {
		System.out.println("----Dados----");
		System.out.println(t.getNome());
		System.out.println(t.getEmail());
		System.out.println(t.getIdade());

	}

}
