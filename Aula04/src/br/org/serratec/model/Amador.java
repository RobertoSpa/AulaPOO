package br.org.serratec.model;

public class Amador extends Maratona {
	private Boolean atestado;

	public Amador(String nome, String sexo, Integer idade, Double altura, Boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + (atestado ? "sim" : "nao");
	}

	public Boolean getAtestado() {
		return atestado;
	}
}
