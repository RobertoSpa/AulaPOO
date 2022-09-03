package model;

public class ImpostoTotal {
	private Double total = 0.;

	public Double getTotal() {
		return total;
	}

	public void totalGeralTributos(Tributacao t) {
		total += t.calcularICMS();
		total += t.calcularImposto();
	}
}
