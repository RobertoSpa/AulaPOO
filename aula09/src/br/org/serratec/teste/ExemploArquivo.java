package br.org.serratec.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploArquivo {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/PROJETOS/bolo.txt");
			System.out.println("achei");
		} catch (FileNotFoundException e) {
			System.out.println("kd");
			e.printStackTrace();
		}
	}

}
