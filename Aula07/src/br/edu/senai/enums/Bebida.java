package br.edu.senai.enums;

public enum Bebida {
	refrigerante("refri ", 6.), agua("aguita ", 3.), suco("suquinho ", 7.), cerveja("cevada ", 8.);

	private String tipo;
	private double valor;

	private Bebida(String tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return tipo + "valor " + valor;
	}
}
