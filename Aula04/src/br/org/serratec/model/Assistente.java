package br.org.serratec.model;

public class Assistente extends Funcionario {
	public Assistente(String cpf, String nome, Double salario, String tipo) {
		super(cpf, nome, salario);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	private String tipo;
}
