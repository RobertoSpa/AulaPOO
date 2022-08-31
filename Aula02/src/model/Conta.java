package model;

public class Conta {
	public int numeroConta;
	public String titular;
	public double saldo;
	
	public void deposito (double valor) {
		saldo += valor;
	}
	
	public boolean saque(double valor) {
		if (saldo < valor) {
			return false;
		} else {
			return true;
		}
	}
}
