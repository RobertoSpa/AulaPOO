package br.org.serratec.teste;

import br.org.serratec.calculo.CalcularMedia;

public class TesteDivisao {

	public static void main(String[] args) {
		try {
			System.out.println(CalcularMedia.calcular(10, 0));
		} catch (ArithmeticException e) {
			System.out.println("divisao por zero n pode fih");
			e.printStackTrace();
		} finally {
			System.out.println("sempre e executado");
		}

	}

}
