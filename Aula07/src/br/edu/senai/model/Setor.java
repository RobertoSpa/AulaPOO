package br.edu.senai.model;

public class Setor {
	private int numero;
	private String descricao;

	public Setor(int numero, String descricao) {
		super();
		this.numero = numero;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Setor [numero=" + numero + ", descricao=" + descricao + "]";
	}

	public int getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}

}
