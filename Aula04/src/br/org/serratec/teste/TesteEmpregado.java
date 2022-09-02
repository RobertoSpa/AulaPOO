package br.org.serratec.teste;

import br.org.serratec.model.CalcularSalario;
import br.org.serratec.model.Empregado;
import br.org.serratec.model.Programador;
import br.org.serratec.model.Tecnico;

public class TesteEmpregado {

	public static void main(String[] args) {
		Tecnico tecnico = new Tecnico("jorge", "jormail", 2000.);
		Programador programador = new Programador("ana", "anamail", 1300., "java");
		// Empregado empregado = new Tecnico("ana", "anamail", 1300.);

		Empregado empregado = tecnico;
		empregado = programador;

		System.out.println(tecnico);

		CalcularSalario cs = new CalcularSalario();
		cs.folhaPagamento(programador);

	}

}
