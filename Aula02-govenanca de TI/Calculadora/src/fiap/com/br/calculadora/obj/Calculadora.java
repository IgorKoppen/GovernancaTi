package fiap.com.br.calculadora.obj;

public class Calculadora {

	private double resultado;

	public Calculadora() {
		this.resultado =  0;
	}

	public double getResultado() {
		return resultado;
	}

	public void soma(int valor1, int valor2) {
		this.resultado =   valor1 + valor2;
	}

	public void subtracao(int valor1, int valor2) {
		this.resultado =  (valor1 - valor2);

	}

	public void multiplicao(int valor1, int valor2) {
		this.resultado = (double) valor1 * valor2;

	}

	public void divisao(int valor1, int valor2) {
		this.resultado = (double) valor1 / valor2;
	}

	public void resetarCalculadora() {
     resultado = 0;
	}
}
