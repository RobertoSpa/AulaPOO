package exercicios;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int [] p;
		p = new int[10];
		
		Pessoas p1 = new Pessoas();
		Pessoas p2 = new Pessoas();
		Pessoas p3 = new Pessoas();
		Pessoas p4 = new Pessoas();

		p1.idade = JOptionPane.showInputDialog("Insira a idade da pessoa 1: ");
		p[0] = Integer.parseInt(p1.idade);
		
		p2.idade = JOptionPane.showInputDialog("Insira a idade da pessoa 2: ");
		p[1] = Integer.parseInt(p2.idade);
		
		p3.idade = JOptionPane.showInputDialog("Insira a idade da pessoa 3: ");
		p[2] = Integer.parseInt(p3.idade);
		
		p4.idade = JOptionPane.showInputDialog("Insira a idade da pessoa 4: ");
		p[3] = Integer.parseInt(p4.idade);
		
		
		for (int i = 0; i < 4; i++) {
			if (p[i] > max) {
				max = p[i];
			}
			if (p[i] < min) {
				min = p[i];
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "A maior pessoa mais velha tem " + max + " anos.");
	}

}
