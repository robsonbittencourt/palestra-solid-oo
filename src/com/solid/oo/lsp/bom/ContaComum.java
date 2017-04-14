package com.solid.oo.lsp.bom;

public class ContaComum {
	
	private ManipuladorDeSaldo manipuladorSaldo;

	public ContaComum() {
		this.manipuladorSaldo = new ManipuladorDeSaldo();
	}
	
	public void deposita(double valor) {
		this.manipuladorSaldo.deposita(valor);
	}
	
	public double getSaldo() {
		return this.manipuladorSaldo.getSaldo();
	}
	
	public void rende() {
		this.manipuladorSaldo.rende(1.1);;
	}
	
}

