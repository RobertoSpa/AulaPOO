package br.org.serratec.model;

public class Maratona {
	protected String nome;
	protected String sexo;
	protected Integer idade;
	protected Double altura;

	public Maratona(String nome, String sexo, Integer idade, Double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return nome + "\n" + sexo + "\n" + idade + "\n" + altura;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public Double getAltura() {
		return altura;
	}

	public Boolean podeCompetir() {
		return (altura >= 1.8 || idade >= 18) ? true : false;
	}
}
