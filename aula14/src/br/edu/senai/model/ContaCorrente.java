package br.edu.senai.model;

import br.edu.interfaces.Conta;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		System.out.println("transacao ok");

	}

	@Override
	public void investimento() {
		System.out.println("investimento ok");
	}

}
