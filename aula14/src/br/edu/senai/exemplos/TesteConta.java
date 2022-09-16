package br.edu.senai.exemplos;

import br.edu.interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = () -> System.out.println("transacao efetuada");
		conta.transacao();
		Conta conta2 = () -> System.out.println("transacao conta 2");
		conta2.transacao();
	}
}
