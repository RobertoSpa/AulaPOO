package teste;

import model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.matricula = 123;
		aluno1.email = "carlos@gmail.com";
		aluno1.nome = "Carlos";
		
		System.out.printf("%s %d", aluno1.nome, aluno1.matricula);
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = aluno2;
		
		/*if (aluno2 == aluno3) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}*/
	}

}
