package model;

public interface Conta {
	Double taxaBancaria = 2.5;

	Boolean saque(Double valor);

	void deposito(Double valor);
}
