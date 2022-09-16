package br.edu.senai.model;

import java.io.Serializable;

public class Fornecedor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cnpj, nome, email;

	public Fornecedor(String cnpj, String nome, String email) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + "]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

}
