package br.edu.senai.model;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> cores = new HashSet<>();
		cores.add("azul");
		cores.add("azul");
		cores.add("vermelho");
		cores.add("laranja");
		cores.add("azul");
		System.out.println(cores);
	}

}
