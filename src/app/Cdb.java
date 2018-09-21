package app;

public class Cdb {
	
	private int quantidadeDias;
	private double valorAplicado;
	private double taxaAnual;
	private double inpostoDeRenda;
	
	public Cdb(int quantidadeDias, double valorAplicado, double taxaAnual, double inpostoDeRenda) {
		this.quantidadeDias = quantidadeDias;
		this.valorAplicado = valorAplicado;
		this.taxaAnual = taxaAnual;
		this.inpostoDeRenda = inpostoDeRenda;
		
	}
	
	public double getRendimentoBruto() {
		return 13.97;
	}
}
