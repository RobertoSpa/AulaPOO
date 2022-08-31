package teste;

import java.util.Scanner;

public class Entradas2 {

	public static void main(String[] args) {
		String nome;
		int idade;
		double altura;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("insira o nome: ");
		nome = sc.next();
		
		System.out.print("insira o idade: ");
		idade = sc.nextInt();
		
		System.out.print("insira o altura: ");
		altura = sc.nextDouble();
		
		System.out.printf("nome: %s\nidade: %d\naltura: %.2f", nome, idade, altura);
		
		sc.close();
	}

}
