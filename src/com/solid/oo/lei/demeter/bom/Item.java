package com.solid.oo.lei.demeter.bom;

public class Item {
	
	private Desconto desconto;

	public double getValorDesconto() {
		return desconto.getValor();
	}

}
