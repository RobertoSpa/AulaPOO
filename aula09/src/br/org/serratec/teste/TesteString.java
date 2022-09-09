package br.org.serratec.teste;

public class TesteString {

	public static void main(String[] args) {
		String texto = "teste";

		try {
			texto = texto.toUpperCase();
			System.out.println(texto);
		} catch (Exception e) {
			System.out.println("cade o texto criatura");
		}

	}

}
