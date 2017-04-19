package com.solid.oo.modelos.anemicos.bom;

import java.util.List;

import com.solid.oo.modelos.anemicos.ruim.Pagamento;

public class Fatura {

	private List<Pagamento> pagamentos;

	public boolean isPaga() {
		boolean isPaga = true;

		for (Pagamento pagamento : this.pagamentos) {
			if (!pagamento.isPago()) {
				isPaga = false;
				break;
			}
		}

		return isPaga;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

}
