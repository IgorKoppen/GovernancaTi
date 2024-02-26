package fiap.com.br.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiap.com.br.model.Calculadora;

public class CalculadoraTeste {

	Calculadora calculadora = new Calculadora();

	@Test
	void somaDePositivos() {
		assertEquals(2, calculadora.soma(1, 1), 0);
	}

	@Test
	void somaDeNegativos() {

		assertEquals(-2, calculadora.soma(-1, -1), 0);
	}

	@Test
	void subtracaoDePositivos() {

		assertEquals(0, calculadora.subtracao(1, 1), 0);
	}

	@Test
	void subtracaoDeNegativos() {
		assertEquals(0, calculadora.subtracao(-1, -1), 0);

	}
}
