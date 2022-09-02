package br.org.serratec.model;

public class Fixo extends Vendedor {
	private Double salarioBase;
	private Double comissao;
	private Double salarioBruto;
	private Double venda;

	public Fixo(String nome, String cpf, Double salarioBase, Double comissao, Double salarioBruto, Double venda) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.salarioBruto = salarioBruto;
		this.venda = venda;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Double getVenda() {
		return venda;
	}

	public void setVenda(Double venda) {
		this.venda = venda;
	}

	public void calcularSalario() {
		salarioBruto = salarioBruto + (venda * comissao);
	}
}
