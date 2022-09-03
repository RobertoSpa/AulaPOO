package br.edu.senai.teste;

import br.edu.senai.model.Imovel;
import br.edu.senai.model.Pessoa;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("ana", "anamail");
		Pessoa pessoa2 = new Pessoa("maria", "mariamail");

		Imovel imovel1 = new Imovel("predio", "centro", 1000., pessoa1);
		System.out.println(imovel1.getPessoa().getNome());
	}

}
