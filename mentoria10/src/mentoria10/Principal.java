package mentoria10;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(10);
		numeros.add(100);
		numeros.add(1);
		numeros.add(10);

		numeros.forEach(i -> System.out.println(i));
	}

}
