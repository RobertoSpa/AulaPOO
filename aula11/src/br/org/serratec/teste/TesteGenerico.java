package br.org.serratec.teste;

import br.org.serratec.generico.MeuGenerico;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Funcionario;

public class TesteGenerico {

	public static void main(String[] args) {
		MeuGenerico<String> mg1 = new MeuGenerico<String>("hello!");
		MeuGenerico<Integer> mg2 = new MeuGenerico<Integer>(1000);
		MeuGenerico<Funcionario> mg3 = new MeuGenerico<Funcionario>(new Funcionario("jose", "zemail.com", 2600.));
		System.out.println(mg3);

		MeuGenerico<? super Funcionario> mg4 = new MeuGenerico<Funcionario>(
				new Diretor("marconha", "marmail.com", 9000., "CIO"));

		System.out.println(mg4);
	}

}
