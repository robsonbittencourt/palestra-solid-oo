package com.solid.oo.open.closed.ruim;

public class FilaContabilidade {
	
	public void enviarParaFilaProcessamento(Fatura fatura) {
		System.out.println("Enviando fatura " + fatura.getNumero() + " para a fila de processamento...");
	}

}
