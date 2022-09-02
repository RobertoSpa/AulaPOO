package br.org.serratec.model;

public class Empregado {
	protected String nome;
	protected String email;
	protected Double salario;

	public Empregado(String nome, String email, Double salario) {
		super();
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Double getSalario() {
		return salario;
	}
}
