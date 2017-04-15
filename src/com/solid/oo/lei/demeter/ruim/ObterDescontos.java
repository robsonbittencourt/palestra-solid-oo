package com.solid.oo.lei.demeter.ruim;

import java.util.List;

public class ObterDescontos {
	
	List<Item> items;
	double totalDesconto = 0;

	public double obterDesconto() {
		for (Item item : items) {
			totalDesconto += item.getDesconto().getValor();
		}
		
		return totalDesconto;
	}

}
