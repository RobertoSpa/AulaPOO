package br.edu.senai.arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LeituraBinaria {

	public static void main(String[] args) {

		try {
			FileInputStream arquivo = new FileInputStream("/exemplos/teste.dat");
			DataInputStream lerArquivo = new DataInputStream(arquivo);
			String resultado = lerArquivo.readLine();
			System.out.println(resultado);
			lerArquivo.close();
		} catch (IOException e) {
			System.out.println("arquivo nao encontrado");
		}

	}

}
