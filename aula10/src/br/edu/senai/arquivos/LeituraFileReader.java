package br.edu.senai.arquivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeituraFileReader {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(new FileReader("/exemplos/leitura.txt"));
			while (scan.hasNext()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("arquivo nao encontrado");
		}
	}

}
