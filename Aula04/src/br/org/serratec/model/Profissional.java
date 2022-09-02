package br.org.serratec.model;

public class Profissional extends Maratona {
	private Double peso;

	public Profissional(String nome, String sexo, Integer idade, Double altura, Double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + peso;
	}

	public Double getPeso() {
		return peso;
	}
}
