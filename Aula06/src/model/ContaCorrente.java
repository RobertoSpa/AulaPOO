package model;

public class ContaCorrente implements Conta {
	private String titular;
	private Double saldo;

	public ContaCorrente(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "titular: " + titular + "\nSaldo: " + saldo;
	}

	@Override
	public Boolean saque(Double valor) {
		if (saldo > valor) {
			saldo = saldo - valor - taxaBancaria;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void deposito(Double valor) {
		saldo += valor;
	}

}
