package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		List<String> times = Arrays.asList("mengao", "flu", "fogao");
		// times.forEach(batata -> System.out.println(batata));

		// times.stream().map(t -> t.substring(0, 3)).forEach(t ->
		// System.out.println(t));
		List<String> timesAbreviados = times.stream().map(t -> t.substring(0, 3)).collect(Collectors.toList());
		timesAbreviados.forEach(t -> System.out.println(t));
	}

}
