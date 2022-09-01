package br.org.serratec.model;

public class TesteVeiculo {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca("ABC-1234");
		veiculo.setTipoCombustivel("Flex");
		veiculo.setValor(40000.);

		System.out.println(veiculo.getValor());
		System.out.println("valor IPVA: " + veiculo.calcularIPVA());

	}

}
