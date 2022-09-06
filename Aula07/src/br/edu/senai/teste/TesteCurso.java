package br.edu.senai.teste;

import br.edu.senai.enums.PeriodoCurso;
import br.edu.senai.model.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("c.comp", PeriodoCurso.NOTURNO);
		System.out.println(curso.getNome() + " " + PeriodoCurso.INTEGRAL.getDias());

	}

}
