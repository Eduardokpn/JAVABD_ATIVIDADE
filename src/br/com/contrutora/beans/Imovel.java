package br.com.contrutora.beans;

public class Imovel {
	
	private double metrosQuadrados;
	private int quantidadeQuartos;
	private int quantidadesBanheiros;
	private String enderecoCompleto;
	public double getMetrosQuadrados() {
		return metrosQuadrados;
	}
	public void setMetrosQuadrados(double metrosQuadrados) {
		this.metrosQuadrados = metrosQuadrados;
	}
	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}
	public void setQuantidadeQuartos(int quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}
	public int getQuantidadesBanheiros() {
		return quantidadesBanheiros;
	}
	public void setQuantidadesBanheiros(int quantidadesBanheiros) {
		this.quantidadesBanheiros = quantidadesBanheiros;
	}
	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}
	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}
	
}
