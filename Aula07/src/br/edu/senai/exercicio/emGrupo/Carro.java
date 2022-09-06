package br.edu.senai.exercicio.emGrupo;

import java.time.LocalDate;

public class Carro extends Veiculo implements Oficina {

	private String categoria;

	public Carro(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado += TipoServico.lavagem.getValorPorServico();
	}

	@Override
	public double trocarOleo() {

		if (dataConserto.getDayOfWeek().name().equals("SATURDAY")) {
			valorCobrado += TipoServico.oleo.getValorPorServico() - 50;
		} else {
			valorCobrado += TipoServico.oleo.getValorPorServico();
		}
		return valorCobrado;
	}

	@Override
	public double revisao() {

		if (dataConserto.getMonthValue() == 8) {
			valorCobrado += TipoServico.revisao.getValorPorServico() * 0.9;
		} else {
			valorCobrado += TipoServico.revisao.getValorPorServico();
		}
		return valorCobrado;
	}

}
