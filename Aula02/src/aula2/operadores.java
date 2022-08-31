package aula2;

public class operadores {

	public static void main(String[] args) {
		int idade = 19;
		double altura = 1.65;

		String resposta = idade >= 18 || altura >= 1.80 ? "participa" : "ta fora";
		System.out.println(resposta);
	}

}
