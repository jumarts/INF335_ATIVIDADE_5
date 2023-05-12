package br.unicamp.ic.inf335.beans.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.AnuncianteBean;
import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;

class AnuncianteBeanTest {

	private static AnuncianteBean anuncianteBean;
	private static ArrayList<AnuncioBean> anuncios;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		anuncios = new ArrayList<>();
		anuncios.add(new AnuncioBean(new ProdutoBean("1", "a", "jupter", 160.00, "Ativo"), null, 0.1));
		anuncios.add(new AnuncioBean(new ProdutoBean("2", "b", "marte", 20.00, "Ativo"), null, 0.1));
		anuncios.add(new AnuncioBean(new ProdutoBean("3", "c", "terra", 30.00, "Ativo"), null, 0.1));
		anuncios.add(new AnuncioBean(new ProdutoBean("4", "d", "saturno", 50.00, "Ativo"), null, 0.1));
		anuncianteBean = new AnuncianteBean("jose", "4213965890", anuncios);
	}

	@Test
	public void removerItemLista() {

		var resultadoListaTamanho = anuncianteBean.getAnuncios().size();
		anuncianteBean.removeAnuncio(1);
		assertEquals(resultadoListaTamanho - 1, anuncianteBean.getAnuncios().size());

	}

	@Test
	public void adicionarItemLista() {

		var resultadoListaTamanho = anuncianteBean.getAnuncios().size();
		anuncianteBean.addAnuncio(new AnuncioBean(new ProdutoBean("2", "b", "marte", 20.00, "Ativo"), null, 0.1));
		assertEquals(resultadoListaTamanho + 1, anuncianteBean.getAnuncios().size());

	}

	@Test
	public void valorMedioAnuncios() {
		var resultado = anuncianteBean.valorMedioAnuncios();
		assertEquals(58.5, resultado);
	}

}
