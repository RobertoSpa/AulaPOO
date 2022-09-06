package br.edu.senai.exercicio.emGrupo;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("anderson");
		Carro carro = new Carro("gol", 0, LocalDate.of(2022, 9, 3), p1, "bola");

		carro.trocarOleo();
		carro.revisao();

		System.out.println(carro.getProprietario());
		System.out.println(carro);
	}

}
