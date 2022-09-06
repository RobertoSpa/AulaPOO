package br.edu.senai.enums;

public enum PeriodoCurso {
	TARDE("terça e quinta", 40, 2500.), NOTURNO("segudna e quarta", 20, 1000.), INTEGRAL("sexta", 80, 3200.);

	private String dias;
	private Integer cargaHoraria;
	private Double valor;

	private PeriodoCurso(String dias, Integer cargaHoraria, Double valor) {
		this.dias = dias;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	public String getDias() {
		return dias;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public Double getValor() {
		return valor;
	}

}
