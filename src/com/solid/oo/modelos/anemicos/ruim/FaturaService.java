package com.solid.oo.modelos.anemicos.ruim;

public class FaturaService {
	
	public boolean isFaturaPaga(Fatura fatura) {
		boolean isPaga = true;
		
		for (Pagamento pagamento : fatura.getPagamentos()) {
			if (!pagamento.isPago()) {
				isPaga = false;
				break;
			}
		}
		
		return isPaga;
	}

}
