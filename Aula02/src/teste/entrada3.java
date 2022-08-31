package teste;

import javax.swing.JOptionPane;

public class entrada3 {

	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog("num: ");
		String numero2 = JOptionPane.showInputDialog("num 2: ");
		
		Double nota1 = Double.parseDouble(numero1);
		Double nota2 = Double.parseDouble(numero2);
		
		JOptionPane.showMessageDialog(null, "media: "+(nota1+nota2)/2);
		
	}

}
