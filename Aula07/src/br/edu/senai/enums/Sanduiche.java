package br.edu.senai.enums;

public enum Sanduiche {
	HAMBURGER("hamburgui ", 20.), MISTO("mistao ", 8.), HOTDOG("dogao ", 12.);

	private String tipoSanduiche;
	private Double valor;

	private Sanduiche(String tipoSanduiche, Double valor) {
		this.tipoSanduiche = tipoSanduiche;
		this.valor = valor;
	}

	public String getTipoSanduiche() {
		return tipoSanduiche;
	}

	public Double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return tipoSanduiche + "valor " + valor;
	}

}
