package br.edu.senai.model;

public class VetorEmpregado {

	public static void main(String[] args) {
		// Empregado emp1 = new Empregado("lucas", "123");
		// Empregado emp2 = new Empregado("roni", "456");
		Empregado[] empregados = new Empregado[3];
		empregados[0] = new Empregado("lucas", "123");
		empregados[1] = new Empregado("roni", "546");
		empregados[2] = new Empregado("robs", "789");

		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}

	}

}
