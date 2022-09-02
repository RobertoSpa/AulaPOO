package br.org.serratec.teste;

import java.util.Scanner;

import br.org.serratec.model.Fixo;

public class TesteVendedor {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean indo = true;
		int escolha;
		double total = 0.;

		Fixo fixo1 = new Fixo("Joana", "123", 1000., 0.1, 1000., 0.0);
		Fixo fixo2 = new Fixo("Maria", "321", 1000., 0.1, 1000., 0.0);

		System.out.println("Vendedores:");
		System.out.println("1 - " + fixo1.getNome());
		System.out.println("2 - " + fixo2.getNome());

		do {
			System.out.println("Escolha o vendedor:");
			escolha = scan.nextInt();

			if (escolha == 1) {
				total += conta(fixo1);
			} else {
				total += conta(fixo2);
			}

			System.out.println("Deseja encerrar o programa? (S/N)");
			String enc = scan.next();
			if (enc.equals("n")) {
				indo = true;
			} else {
				indo = false;
			}
		} while (indo);

		System.out.println(fixo1.getNome() + "\n" + fixo1.getSalarioBruto());
		System.out.println(fixo2.getNome() + "\n" + fixo2.getSalarioBruto());
		System.out.println("total:\n" + total);
	}

	public static double conta(Fixo batata) {
		System.out.println("Insira o valor da venda:");
		double v = scan.nextDouble();
		batata.setVenda(v);
		batata.calcularSalario();
		return v;
	}

}
