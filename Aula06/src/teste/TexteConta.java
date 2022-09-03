package teste;

import model.ContaCorrente;

public class TexteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("roberto", 10000.);

		cc.deposito(1000.);
		cc.saque(500.);

		System.out.println(cc.toString());
	}

}
