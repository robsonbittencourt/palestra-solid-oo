package com.solid.oo.open.closed.bom;

import com.solid.oo.open.closed.ruim.Fatura;

public class FilaContabilidade implements AcaoPosPagamento {
	
	private Fatura fatura;

	public FilaContabilidade(Fatura fatura) {
		this.fatura = fatura;
	}
	
	@Override
	public void executar() {
		System.out.println("Enviando fatura " + fatura.getNumero() + " para a fila de processamento...");
	}
	
}
