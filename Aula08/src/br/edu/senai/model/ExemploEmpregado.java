package br.edu.senai.model;

import java.util.ArrayList;
import java.util.List;

public class ExemploEmpregado {

	public static void main(String[] args) {
		List<Empregado> empregados = new ArrayList<>();
		empregados.add(new Empregado("lucas", "123"));
		empregados.add(new Empregado("roni", "546"));
		empregados.add(new Empregado("robs", "789"));

		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}
	}

}
