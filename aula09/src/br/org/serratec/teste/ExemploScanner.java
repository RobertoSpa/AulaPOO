package br.org.serratec.teste;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		Integer num;
		Scanner scan = new Scanner(System.in);
		try {

			System.out.println("Insira um numero: ");
			num = scan.nextInt();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("eu disse numero");
		}
		scan.close();
	}

}
