package br.edu.senai.exercicio.emGrupo;

import java.time.LocalDate;

public class Moto extends Veiculo implements Oficina {

	private int cilindradas;

	public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	@Override
	public double lavarVeiculo() {

		return 0;
	}

	@Override
	public double trocarOleo() {

		return 0;
	}

	@Override
	public double revisao() {

		return 0;
	}

}
