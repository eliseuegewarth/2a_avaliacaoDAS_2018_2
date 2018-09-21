package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.Cdb;

public class CdbTests {

	
	@Test
	public void RendimentoBrutoTest() {
		Cdb investimento = new Cdb(60, 1000.00, 0.085, 0.225);
		assertEquals(13.97, investimento.getRendimentoBruto(), 0.5);
	}
}
