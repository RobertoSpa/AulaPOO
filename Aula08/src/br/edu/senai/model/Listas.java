package br.edu.senai.model;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List listaDeTimes = new ArrayList<>();
		listaDeTimes.add("flamengo");
		listaDeTimes.add("vasco");
		listaDeTimes.add("fluminense");
		listaDeTimes.add("botafogo");
		listaDeTimes.remove(1);
		listaDeTimes.set(2, "bangu 2");
		System.out.println(listaDeTimes);

	}

}
