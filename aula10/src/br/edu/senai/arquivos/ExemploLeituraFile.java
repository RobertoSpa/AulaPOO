package br.edu.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraFile {

	public static void main(String[] args) {

		try {
			File arquivo = new File("/exemplos/leitura.txt");
			Scanner scan = new Scanner(arquivo);
			scan.useDelimiter(";");
			while (scan.hasNext()) {
				System.out.println(scan.next());

			}
			scan.close();

		} catch (FileNotFoundException e) {
			System.out.println("caminho arquivo invalido");
		}
	}

}
