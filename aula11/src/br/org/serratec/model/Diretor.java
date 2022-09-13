package br.org.serratec.model;

public class Diretor extends Funcionario {
	private String categoria;

	public Diretor(String nome, String email, double valor, String categoria) {
		super(nome, email, valor);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

}
