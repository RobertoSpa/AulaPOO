package br.edu.senai.arquivos;

import java.io.File;
import java.util.Scanner;

public class ExemploListagemArquivoDiretorio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o caminho");
		String caminho = scan.next();

		File file = new File(caminho);

		if (file.exists()) {
			if (file.isFile()) {
				System.out.printf("\n(%s) existe, tamanho = %d bytes", file.getName(), file.length());
			} else {
				System.out.println("conteudo do diretorio: " + file.length());
				String diretorio[] = file.list();
				for (String bunda : diretorio) {
					System.out.printf("%s\n", bunda);
				}
			}

		} else {
			System.out.println("nao encontrado");
		}
		scan.close();
	}

}
