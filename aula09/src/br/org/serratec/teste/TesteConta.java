package br.org.serratec.teste;

import br.org.serratec.excecao.ContaException;
import br.org.serratec.model.Poupanca;

public class TesteConta {

	public static void main(String[] args) {
		Poupanca poupanca = new Poupanca("jaquin", 1000.);

		try {
			poupanca.deposito(100.);
			poupanca.saque(20000.);
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}

	}

}
