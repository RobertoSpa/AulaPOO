package teste;

import model.Empresa;
import model.ImpostoTotal;
import model.Pessoa;

public class TesteImposto {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("roberto", 82000.);
		Empresa empresa1 = new Empresa("ABC", 259000.);
		ImpostoTotal t = new ImpostoTotal();

		t.totalGeralTributos(empresa1);
		t.totalGeralTributos(pessoa1);
		// System.out.println(empresa1 + "\n" + empresa1.calcularICMS() + "\n" +
		// empresa1.calcularImposto());
		// System.out.println("\n" + pessoa1 + "\n" + pessoa1.calcularImposto());
		System.out.println(t.getTotal());
	}

}
