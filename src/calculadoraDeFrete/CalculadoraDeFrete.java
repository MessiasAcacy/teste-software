package calculadoraDeFrete;

public class CalculadoraDeFrete {

	private double frete;

	public CalculadoraDeFrete() {}

	public double calcularFrete(double valorC, double distanciaE) {

		if (valorC <= 0) {
			throw new ValorCompraException("O valor da compra deve ser maior que zero.");
		}
		if (distanciaE < 0) {
			throw new DistanciaException("A distância deve ser maior ou igual a zero.");
		}

		frete = (10 + (0.5 * distanciaE));
		if (valorC > 100) {
			frete = 0.0;
			return frete;

		} else if (valorC >= 70 && valorC <= 100) {
			return frete * 0.5;
		} else {
			return frete;
		}

	}

}
