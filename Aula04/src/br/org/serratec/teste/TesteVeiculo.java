package br.org.serratec.teste;

import br.org.serratec.model.Caminhao;
import br.org.serratec.model.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("123", "321", "vermelho", 10000.);
		v1.calcularIPVA();
		// System.out.println(v1.getValorIPVA());

		Caminhao c1 = new Caminhao(null, null, "preto", 10000., null);
		c1.calcularIPVA();
		// System.out.println(c1.getValorIPVA());

		System.out.println(c1.toString());
	}

}
