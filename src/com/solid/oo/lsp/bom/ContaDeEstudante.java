package com.solid.oo.lsp.bom;

public class ContaDeEstudante {
	
	private int milhas;
	private ManipuladorDeSaldo manipuladorSaldo;
	
	public void deposita(double valor) {
		this.milhas += (int)valor;
		this.manipuladorSaldo.deposita(valor);
	}
	
	public int getMilhas() {
		return milhas;
	}	
	
	public double getSaldo() {
		return this.manipuladorSaldo.getSaldo();
	}
	
}
