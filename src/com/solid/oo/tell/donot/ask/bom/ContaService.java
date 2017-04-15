package com.solid.oo.tell.donot.ask.bom;

public class ContaService {
	
	public void sacar(Conta conta, double valor) {
		if (conta.getSaldo() >= valor) {
			conta.setSaldo(conta.getSaldo() - valor);
		}		
	}

}
