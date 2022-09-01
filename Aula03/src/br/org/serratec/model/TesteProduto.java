package br.org.serratec.model;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Insira o codigo");
			Integer codigo = sc.nextInt();
			
			System.out.println("Insira a descriçao");
			String descricao = sc.next();
			
			System.out.println("Insira o valor");
			Double valor = sc.nextDouble();
			
			Produto produto = new Produto(codigo, descricao, valor);
			System.out.println("produtos: "+ Produto.getTotalProd());
		}

	}

}
