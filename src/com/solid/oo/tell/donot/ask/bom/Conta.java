package com.solid.oo.tell.donot.ask.bom;

public class Conta {
	
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}		
	}
}
