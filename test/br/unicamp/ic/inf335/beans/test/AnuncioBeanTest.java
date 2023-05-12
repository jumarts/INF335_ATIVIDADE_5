package br.unicamp.ic.inf335.beans.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;

class AnuncioBeanTest {

	private static AnuncioBean anuncioBean;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		anuncioBean = new AnuncioBean(new ProdutoBean("1", "Pirulito", "teste1", 10.00, "Ativo"), null, 0.1);
	}

	@Test
	final void calcularValorProdutoComDesconto() {
		var resultado = anuncioBean.getValor();
		assertEquals(9.00, resultado);
	}
}
