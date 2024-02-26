package fiap.com.br.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fiap.com.br.model.Elevador;
import fiap.com.br.model.Pessoa;

public class ElevadorTeste {
	Elevador elevador;
	Pessoa pessoa;

	@Before
	public void setUp(){
		elevador = new Elevador(200);
		pessoa = new Pessoa("Igor", 40.5);
	}

	@Test
	public void testeEntrarPessoaElevador() {
		assertEquals(40.5, elevador.entrarNoelevador(pessoa.getPeso()), 0);
	}

	@Test
	public void testeSairDoElevador() {
		elevador.entrarNoelevador(pessoa.getPeso());
		assertEquals(0, elevador.sairDoelevador(pessoa.getPeso()), 0);
	}

	@Test
	public void testeAvaliarPesoAcima() {
		assertEquals(true, elevador.avaliarpeso(pessoa.getPeso()));
	}

}
