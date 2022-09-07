package br.edu.senai.model;

import java.util.Arrays;
import java.util.List;

public class ExemploListaArrays {

	public static void main(String[] args) {
		List<String> cores = Arrays.asList("vermelho", "azul", "amarelo");
		// cores.add("branco");
		// System.out.println(cores);
		/*
		 * if (cores.isEmpty()) { System.out.println("ta vazio"); } else {
		 * System.out.println(cores); }
		 */
		// System.out.println("tem vermelho? " + (cores.contains("vermelho") ? "sim" :
		// "nao"));

		cores.forEach(batata -> System.out.println(batata));

		// List<String> meses = List.of("jan", "fev", "mar");
		// System.out.println(meses);
	}

}
