package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Cdb;

@RunWith(Parameterized.class)
public class CdbParameterizedTests {
	private int dias;
	private double aplicacao;
	private double juros;
	private double aliquota;
	private double rendimentoBrutoEsperado;
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{60, 1000.00, 8.5, 22.5, 13.97},
			{120, 500.00, 8.0, 22.5, 13.15},
			{240, 3000.00, 9.0, 20.0, 177.53},
			{270, 2000.00, 8.5, 20.0, 125.75},
			{390, 100.00, 7.5, 17.5, 8.01},
			{420, 250.00, 8.0, 17.5, 23.01},
			{550, 400.00, 8.0, 17.5, 48.22},
			{670, 800.00, 8.0, 17.5, 117.48},
			{700, 2500.00, 9.0, 17.5, 431.51},
			{900, 4200.00, 9.5, 15.0, 983.84},
			{1000, 100.00, 7.5, 15.0, 20.55}
		});
	}
	
	public CdbParameterizedTests(int dias, double aplicacao, double juros, double aliquota, double rendimentoBrutoEsperado) {
		this.dias = dias;
		this.aplicacao = aplicacao;
		this.juros = juros;
		this.aliquota = aliquota;
		this.rendimentoBrutoEsperado = rendimentoBrutoEsperado;
	}
	
	@Test
	public void RendimentoBrutoTest() {
		Cdb investimento = new Cdb(this.dias, this.aplicacao, this.juros, this.aliquota);
		assertEquals(this.rendimentoBrutoEsperado, investimento.getRendimentoBruto(), 0.009);
	}
}
