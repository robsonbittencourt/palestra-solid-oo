package com.solid.oo.lei.demeter.bom;

import java.util.List;

public class ObterDescontos {
	
	List<Item> items;
	double totalDesconto = 0;

	public double obterDesconto() {
		for (Item item : items) {
			totalDesconto += item.getValorDesconto();
		}
		
		return totalDesconto;
	}

}
