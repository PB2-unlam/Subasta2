package ar.edu.unlam.pb2.Subasta2Test;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.Subasta2.Subasta2;

public class Subasta2Test {

	@Test
	public void seCreaAbierta() {
		Subasta2 seCreaAbierta = new Subasta2();
		Boolean estado = seCreaAbierta.estadoSubasta();
		Assert.assertTrue(estado);
	}
	
	@Test
	public void tieneQueCerrarConOfertaMasAlta() {
		Subasta2 ofertaMasAlta = new Subasta2();
		ofertaMasAlta.ofertar(123);
		ofertaMasAlta.ofertar(12);
		ofertaMasAlta.ofertar(434);
		ofertaMasAlta.cerrar();
		ofertaMasAlta.ofertar(345);
		Integer actual = ofertaMasAlta.cerrar();
		Integer expected = 434;
		Assert.assertEquals(expected, actual);
	}

}
