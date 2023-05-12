package br.unicamp.ic.inf335.beans.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.ProdutoBean;

class ProdutoBeanTest {
	private static Double valor;

	private static ProdutoBean produtoBeanTest2;

	@BeforeAll
	static void produtoBean() throws Exception {
		produtoBeanTest2 = new ProdutoBean("1", "Bala", "teste2", 2.30, "Ativo");
		valor = 0.0;
	}

	@Test
	final void comparePositivo() {

		var resultado = compareToPositivo(produtoBeanTest2);
		assertEquals(-1, resultado);

	}

	public int compareToPositivo(ProdutoBean p) {

		if (valor > p.getValor()) {
			return 1;
		} else if (valor < p.getValor()) {
			return -1;
		} else
			return 0;
	}

}
