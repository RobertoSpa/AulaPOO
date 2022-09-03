package br.edu.senai.model;

public class Time {
	private String nome;
	private String treinador;
	private Atletas[] atleta;

	public Time(String nome, String treinador, Atletas[] atleta) {
		this.nome = nome;
		this.treinador = treinador;
		this.atleta = atleta;
	}

	public String getNome() {
		return nome;
	}

	public String getTreinador() {
		return treinador;
	}

	public Atletas[] getAtleta() {
		return atleta;
	}

	public void adicionarAtletas(Atletas atletas) {
		for (int i = 0; i < atleta.length; i++) {
			if (atleta[i] == null) {
				atleta[i] = atletas;
				break;
			}

		}
	}

	public void listarAtletas() {
		for (int i = 0; i < atleta.length; i++) {
			System.out.println(atleta[i].getNome());
		}
	}

}
