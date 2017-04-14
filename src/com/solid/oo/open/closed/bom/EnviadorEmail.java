package com.solid.oo.open.closed.bom;

public class EnviadorEmail implements AcaoPosPagamento {

	@Override
	public void executar() {
		System.out.println("Enviando email...");
	}

}
