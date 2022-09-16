package br.edu.senai.model;

public class Categoria {
	private Integer codigo;
	private String nome;

	public Categoria(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
}
