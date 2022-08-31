package teste;

import model.Conta;

public class testeConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numeroConta = 123;
		conta1.saldo = 1000;
		conta1.titular = "Carlos";
		
		conta1.deposito(200);
		boolean msg = conta1.saque(1000);
		
		Conta conta2 = new Conta();
		conta2.saldo = 1000;
		
		System.out.println(conta2.saque(3000));
		
		if (msg == true) {
			System.out.println("Saque 1 realizado");
		} else {
			System.out.println("Saque 2 falhado");
		}

	}

}
