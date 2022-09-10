package br.edu.senai.arquivos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GravacaoBinaria {

	public static void main(String[] args) {
		try {
			FileOutputStream gravar = new FileOutputStream("/exemplos/teste.dat");
			DataOutputStream gravarArquivo = new DataOutputStream(gravar);
			gravarArquivo.writeChars("java orientaçao a objetos");
			gravarArquivo.close();

		} catch (Exception e) {
			System.out.println("erro na gravaçao");
		}

	}

}
