package br.org.serratec.model;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setAltura(1.83);
		pessoa1.setPeso(80.);
		
		new Pessoa();
		Pessoa pessoa2 = new Pessoa(2, "maria", 100., 1.6);
		
		
		System.out.println(pessoa1.resultadoIMC());
		System.out.println(pessoa2.resultadoIMC());
	
	}

}
