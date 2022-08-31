package aula2;

public class Repeticao {

	public static void main(String[] args) {
		/*for (int j = 0; j < 10; j++) {
			if (j == 5) {
				continue;
			}
			System.out.println(j);
		}*/
		
		String[]vetorzin = {"ana", "maria", "jao"};
		/*for (int i = 0; i < vetorzin.length; i++) {
			System.out.println(vetorzin[i]);
		}*/
		
		for (String nomes : vetorzin) {
			System.out.println(nomes);
		}
	}
}