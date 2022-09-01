package br.org.serratec.model;

public class TesteMedico {
	public static void main(String[] args) {
		Medico medico1 = new Medico(123, "carlos", 9000., 300.);
		Medico medico2 = new Medico(321, "carol", 9000., 300.);
		
		medico1.pagamentoDInheiro();
		medico2.pagamentoPlanoDeSaude();
		
		System.out.println("total de medicos: " + Medico.getContador());
		
	}
	
}
