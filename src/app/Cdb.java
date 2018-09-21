package app;

public class Cdb {
	
	private int quantidadeDias;
	private double valorAplicado;
	private double taxaAnual;
	private double aliquota;
	
	public Cdb(int quantidadeDias, double valorAplicado, double taxaAnual, double inpostoDeRenda) {
		this.quantidadeDias = quantidadeDias;
		this.valorAplicado = valorAplicado;
		this.taxaAnual = taxaAnual;
		this.aliquota = inpostoDeRenda;
		
	}
	
	public double getRendimentoBruto() {
		double tempo = this.quantidadeDias/365.00;
		double result = (double) Math.round(tempo * this.valorAplicado * (this.taxaAnual/100)*100)/100;
		return result;
	}

	public double getImpostoDeRenda() {
		double result = (double) Math.round(this.getRendimentoBruto() * (this.aliquota/100) *100) /100;
		return result;
	}
}
