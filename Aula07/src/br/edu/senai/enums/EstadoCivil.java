package br.edu.senai.enums;

public enum EstadoCivil {
	SOLTEIRO('s'), CASADO('c'), VIUVO('v'), DIVORCIADO('d');

	private char estado;

	private EstadoCivil(char estado) {
		this.estado = estado;
	}

	public char getEstado() {
		return estado;
	}

}
