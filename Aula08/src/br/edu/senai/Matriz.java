package br.edu.senai;

public class Matriz {

	public static void main(String[] args) {
		String pessoas[][] = new String[][] { { "marcos", "mail.com" }, { "ana", "anamail.com" },
				{ "carlos", "carlosmail.com" }, { "adriano", "adrianomail.com" } };

		for (int i = 0; i < pessoas.length; i++) {
			for (int j = 0; j < pessoas[i].length; j++) {
				System.out.println(pessoas[i][j]);
			}
		}
	}

}
