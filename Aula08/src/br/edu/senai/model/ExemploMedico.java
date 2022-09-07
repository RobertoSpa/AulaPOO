package br.edu.senai.model;

import java.util.ArrayList;
import java.util.List;

public class ExemploMedico {

	public static void main(String[] args) {
		List<Medico> medicos = new ArrayList<>();

		medicos.add(new Medico("123", "sergio", 200.));
		medicos.add(new Medico("456", "carla", 290.));
		medicos.add(new Medico("789", "carlos", 100.));
		double maior = 0.;
		String nome = null;

		for (Medico medico : medicos) {
			if (medico.getValorConsulta() > maior) {
				maior = medico.getValorConsulta();
				nome = medico.getNome();
			}
			System.out.println(medico);
		}

		System.out.println(nome + " " + maior);
	}

}
