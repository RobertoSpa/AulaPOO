package br.org.serratec.teste;

import br.org.serratec.model.Funcionario;
import br.org.serratec.model.Sorteio;

public class TesteSorteio {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("ana", "anamail.com", 5600.);
		Funcionario f2 = new Funcionario("julia", "jumail.com", 2600.);
		Funcionario f3 = new Funcionario("silvana", "silmail.com", 4600.);
		Funcionario f4 = new Funcionario("luigi", "lumail.com", 9600.);

		// Sorteio<Funcionario> so = new Sorteio<>();
		// sorteio.adicionar(f1);
		// sorteio.adicionar(f2);
		// sorteio.adicionar(f3);
		// sorteio.adicionar(f4);

		Sorteio<String> so = new Sorteio<>();
		String t1 = "Framengo";
		String t2 = "vasco";
		String t3 = "botafogo";

		so.adicionar(t1);
		so.adicionar(t2);
		so.adicionar(t3);
		so.adicionar(t1);
		so.adicionar(t1);
		so.adicionar(t1);
		so.adicionar(t1);

		System.out.println(so.sorteio());
	}

}
