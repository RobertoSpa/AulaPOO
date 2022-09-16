package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;

import br.edu.senai.model.Aluno;

public class ExemploStream2 {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Mariana", "mari@hotmail.com", 55);
		Aluno aluno2 = new Aluno("Maria", "maria@hotmail.com", 32);
		Aluno aluno3 = new Aluno("Adriana", "a@gmail.com", 15);
		Aluno aluno4 = new Aluno("Oscar", "oscar@hotmail.com", 33);
		Aluno aluno5 = new Aluno("sergio", "sergio@gmail.com", 81);

		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);

		// filter = é usado para filtro de dados e retorna um boolean
		System.out.println("-----Filtro de idade maior de 50 anos");
		alunos.stream().filter(a -> a.getIdade() > 50).forEach(t -> System.out.println(t));
		System.out.println("-----Filtro por Letra que começa com M");
		alunos.stream().filter(a -> a.getNome().startsWith("M")).forEach(t -> System.out.println(t));

	}

}