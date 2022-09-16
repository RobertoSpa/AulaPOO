package br.edu.interfaces;

public interface Conta {
	public void transacao();

	default void investimento() {
		System.out.println("aplicou investimento");
	}
}
