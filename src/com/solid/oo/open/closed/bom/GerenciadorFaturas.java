package com.solid.oo.open.closed.bom;

import java.util.List;

import com.solid.oo.open.closed.ruim.Fatura;

public class GerenciadorFaturas {
	
	private List<AcaoPosPagamento> acoesPosPagamento;
	
	public GerenciadorFaturas(List<AcaoPosPagamento> acoesPosPagamento) {
		this.acoesPosPagamento = acoesPosPagamento;
	}
	
	public void pagarFatura(Fatura fatura) {
		fatura.setPaga(true);
		
		for (AcaoPosPagamento acao : acoesPosPagamento) {
			acao.executar();
		}
	}

}
