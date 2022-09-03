package br.edu.senai.model;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private Boolean confirmado = false;

	public Luta(Lutador desafiante, Lutador desafiado, Boolean confirmado) {

		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.confirmado = confirmado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public Boolean getConfirmado() {
		return confirmado;
	}

	public Boolean confirmacaoLuta() {
		if (!desafiante.equals(desafiado) && desafiante.getCategoria().equals(desafiado.getCategoria())) {
			return true;
		} else {
			return false;
		}
	}
}
