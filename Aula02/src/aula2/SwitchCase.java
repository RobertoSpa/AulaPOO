package aula2;

public class SwitchCase {

	public static void main(String[] args) {
		int mes = 5;

		switch (mes) {
		case 1:
			System.out.println("janeiro");
			break;
		case 2:
			System.out.println("fevereiro");
			break;
		case 3:
			System.out.println("março");
			break;
		case 4:
			System.out.println("abril");
			break;

		default:
			System.out.println("so pode ser maio");
			break;
		}

	}

}
