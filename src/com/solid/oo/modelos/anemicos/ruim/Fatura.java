package com.solid.oo.modelos.anemicos.ruim;

import java.util.List;

public class Fatura {
	
	private boolean paga;
	private List<Pagamento> pagamentos;
	
	public boolean isPaga() {
		return paga;
	}
	
	public void setPaga(boolean paga) {
		this.paga = paga;
	}
	
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}
	
	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

}
