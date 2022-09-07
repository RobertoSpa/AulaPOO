package br.edu.senai;

public class ExemploVetor {

	public static void main(String[] args) {
		String[] vetor = new String[3];
		vetor[0] = "banana";
		// System.out.println(vetor[0]);

		String[] meses = { "jan", "fev", "mar" };

		for (String batata : meses) {
			System.out.println(batata);
		}
	}

}
