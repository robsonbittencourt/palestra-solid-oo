package com.solid.oo.tell.donot.ask.ruim;

public class CaixaEletronico {
	
	public void sacar(Conta conta, double valor) {
		if (conta.getSaldo() >= valor) {
			conta.setSaldo(conta.getSaldo() - valor);
		}		
	}

}
