package com.solid.oo.lsp.bom;

public class ManipuladorDeSaldo {
	
	private double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void rende(double taxa) {
		this.saldo *= taxa;
	}

}
