package br.edu.senai.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int id = 0;

		while (true) {

			System.out.println("Digite o ID: ");
			id = sc.nextInt();

			if (id < 0) {
				break;
			}

			System.out.println("Digite o nome: ");
			String nome = sc.next();

			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();

			System.out.println("Digite o telefone: ");
			String telefone = sc.next();

			clientes.add(new Cliente(id, nome, idade, telefone));

		}
		System.out.println(clientes);
		sc.close();
	}

}