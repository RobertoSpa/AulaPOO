package teste;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("insira um valor");
		a = sc.nextInt();
		
		System.out.println("insira outro valor");
		b = sc.nextInt();
		
		int resultado = a+b;
		System.out.printf("o resultado é %d", resultado);
		
		sc.close();

	}

}
