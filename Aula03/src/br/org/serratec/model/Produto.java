package br.org.serratec.model;

public class Produto {
	private Integer codigo;
	private String descricao;
	private Double valor;
	private static int totalProd;
	
	public Produto(Integer codigo, String descricao, Double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		totalProd++;
	}
	public static int getTotalProd() {
		return totalProd;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public Double getValor() {
		return valor;
	}
	
	
}
