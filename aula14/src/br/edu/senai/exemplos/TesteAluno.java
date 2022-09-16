package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;

import br.edu.senai.model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(new Aluno("jorge", "jmail.com", 45), new Aluno("maria", "mail.com", 18));

//		for (Aluno aluno : alunos) {
//			System.out.println(aluno);
//		}

		// ExibirDadosAluno exibirDadosAluno = new ExibirDadosAluno();
//		Consumer<Aluno> consumer = new Consumer<Aluno>() {
//			@Override
//			public void accept(Aluno t) {
//				System.out.println("----Dados----");
//				System.out.println(t.getNome());
//				System.out.println(t.getEmail());
//				System.out.println(t.getIdade());
//
//			}
//		};
//
//		Consumer<Aluno> exibirDadosAluno = consumer;
//
//		alunos.forEach(exibirDadosAluno);
//
//		alunos.forEach(t -> {
//			System.out.println("---foreach---");
//			System.out.println(t.getNome());
//			System.out.println(t.getEmail());
//		});

	}

}
