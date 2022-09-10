package br.edu.senai;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.edu.senai.model.Empregado;

public class ExemploEmpregadoArquivos {

	public static void main(String[] args) {
		File arquivo = new File("/exemplos/empregados.txt");
		try {
			Scanner scan = new Scanner(arquivo);
			Set<Empregado> empregados = new HashSet<>();

			while (scan.hasNext()) {
				String linha = scan.nextLine();
				if (!linha.isEmpty()) {
					String vetor[] = linha.split(";");
					empregados.add(new Empregado(vetor[0], vetor[1]));

				}
			}
			scan.close();

			System.out.println("dados:");
			for (Empregado jamelao : empregados) {
				System.out.println(jamelao);
			}

			FileWriter arquivoGravar = new FileWriter("/exemplos/empregados-gravar.txt");
			PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
			for (Empregado empregado : empregados) {
				String linha = empregado.getCpf() + ";" + empregado.getNome() + "\n";
				gravacaoArquivo.print(linha);
			}

			System.out.println("arquivo gravado");
			gravacaoArquivo.close();

		} catch (IOException e) {
			System.out.println("meu deus meu senho me ajuda pfvr");
		}
	}

}
