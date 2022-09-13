package br.org.serratec.calendario;

import java.util.Calendar;

public class ExemploCalendario {

	public static void main(String[] args) {
		Calendar dataAtual = Calendar.getInstance();
		System.out.println(dataAtual);
		System.out.println(dataAtual.get(Calendar.DAY_OF_MONTH));

	}

}
