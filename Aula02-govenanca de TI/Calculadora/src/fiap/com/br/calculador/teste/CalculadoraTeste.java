package fiap.com.br.calculador.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fiap.com.br.calculadora.obj.Calculadora;

public class CalculadoraTeste {

Calculadora calculadora = new Calculadora();
	
	
	@Test
	void somaDePositivos() {
		calculadora.soma(1, 1);
		assertEquals(2,calculadora.getResultado());
	}
	
	@Test
	void somaDeNegativos() {
		calculadora.soma(-1, -1);
		assertEquals(-2,calculadora.getResultado());
	}

	@Test
	void subtracaoDePositivos() {
		calculadora.subtracao(1, 1);
		assertEquals(0,calculadora.getResultado());
	}
	
	@Test
	void  subtracaoDeNegativos() {
		calculadora.subtracao(-1, -1);
		assertEquals(0,calculadora.getResultado());
	}
	
	@Test
	
	void  multiplicacaoDePositivos() {
		calculadora.multiplicao(2, 4);
		assertEquals(8,calculadora.getResultado());
	}
	@Test
	void  multiplicacaoDeNegativos() {
		calculadora.multiplicao(-2, -4);
		assertEquals(8,calculadora.getResultado());
	}
	@Test
	void divisaoDePositivos() {
		calculadora.divisao(4, 5);
		assertEquals(0.8,calculadora.getResultado());
	}
	
	@Test
	void  divisaoDeNegativos() {
		calculadora.divisao(-20, -2);
		assertEquals(10,calculadora.getResultado());
	}
	

}
