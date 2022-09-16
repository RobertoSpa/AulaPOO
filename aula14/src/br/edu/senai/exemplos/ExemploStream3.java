package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;

public class ExemploStream3 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(10, 100, 1000, 20, 200, 2000);
//		numeros.stream().map(t -> t + 10).forEach(t -> System.out.println(t));
//		numeros.forEach(t -> System.out.println(t));
		numeros.stream().limit(3).forEach(n -> System.out.println(n));
	}

}
