package fiap.com.br.calculadora;

import fiap.com.br.calculadora.obj.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		calculadora.soma(10, 20);
		System.out.println("Soma de positivos: " + calculadora.getResultado());
		
		calculadora.soma(-10, -20);
		System.out.println("Soma de negativos: " + calculadora.getResultado());
		
		calculadora.subtracao(10, 20);
		System.out.println("subtração de positivos: " + calculadora.getResultado());
		calculadora.subtracao(-10, -20);
		System.out.println("subtração de negativos: " + calculadora.getResultado());
		
		calculadora.multiplicao(2, 4);
		System.out.println("multiplicao de positivos: " + calculadora.getResultado());
		calculadora.multiplicao(-10, -20);
		System.out.println("multiplicao de negativos: " + calculadora.getResultado());
		
		calculadora.divisao(4,5);
		System.out.println("divisao de positivos: " + calculadora.getResultado());
		calculadora.divisao(-20,-2);
		System.out.println("divisao de negativos: " + calculadora.getResultado());
	}

}
