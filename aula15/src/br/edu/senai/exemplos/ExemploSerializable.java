package br.edu.senai.exemplos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Fornecedor;

public class ExemploSerializable {

	public static void main(String[] args) {
		List<Fornecedor> leituraFornecedores = new ArrayList<>();
		List<Fornecedor> gravacaoFornecedores = new ArrayList<>();

		Fornecedor fornecedor1 = new Fornecedor("123", "ABC", "abc@mail.com");
		Fornecedor fornecedor2 = new Fornecedor("456", "DEF", "def@mail.com");
		Fornecedor fornecedor3 = new Fornecedor("789", "GHI", "ghi@mail.com");

		gravacaoFornecedores.add(fornecedor1);
		gravacaoFornecedores.add(fornecedor2);
		gravacaoFornecedores.add(fornecedor3);

		System.out.println("-----gravaçao-----");
		try {
			FileOutputStream arquivoGravar = new FileOutputStream("/exemplos/fornecedor.dat");
			ObjectOutputStream gravarObjeto = new ObjectOutputStream(arquivoGravar);
			gravarObjeto.writeObject(gravacaoFornecedores);
			gravarObjeto.flush();
			gravarObjeto.close();
			arquivoGravar.flush();
			arquivoGravar.close();
			System.out.println("gravado com sucesso!");
		} catch (Exception e) {
			System.out.println("error!");
			e.printStackTrace();
		}

//		System.out.println("-----recuperando objetos-----");
//
//		try {
//			FileInputStream arquivoLeitura = new FileInputStream("/exemplos/fornecedor.dat");
//			ObjectInputStream leituraObjeto = new ObjectInputStream(arquivoLeitura);
//			leituraFornecedores = (ArrayList<Fornecedor>) leituraObjeto.readObject();
//			leituraObjeto.close();
//			arquivoLeitura.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(leituraFornecedores);

	}

}
