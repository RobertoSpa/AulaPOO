package br.edu.senai.exemplos;

import java.util.Optional;

import br.edu.senai.model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(1, "carlos", null, 2500.);
		Optional<Funcionario> funcionario2 = null;

		System.out.println(funcionario.getNome());
		if (!funcionario2.isPresent()) {

		} else {

		}
	}

}
