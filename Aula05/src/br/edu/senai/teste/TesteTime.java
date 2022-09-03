package br.edu.senai.teste;

import br.edu.senai.model.Atletas;
import br.edu.senai.model.Time;

public class TesteTime {

	public static void main(String[] args) {
		Atletas atleta1 = new Atletas("neymar", "atacante");
		Atletas atleta2 = new Atletas("kroos", "meio");
		Atletas atleta3 = new Atletas("ramos", "zagueiro");

		Time time1 = new Time("flamengo", "dorival", new Atletas[3]);
		time1.adicionarAtletas(atleta1);
		time1.adicionarAtletas(atleta2);
		time1.adicionarAtletas(atleta3);

		System.out.println(time1.getNome());
		time1.listarAtletas();
	}

}
