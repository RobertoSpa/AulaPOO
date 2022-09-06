package br.edu.senai.exercicio.emGrupo;

public enum TipoServico {
	oleo(100), lavagem(50), revisao(200);

	private double valorPorServico;

	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	public double getValorPorServico() {
		return valorPorServico;
	}

}
