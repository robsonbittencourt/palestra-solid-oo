package com.solid.oo.dip.bom;

public class Lampada implements Dispositivo {
	
	private boolean ligada;
	
	@Override
	public boolean isLigado() {
		return ligada;
	}
	
	@Override
	public void ligar() {
		System.out.println("Lâmpada ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Lâmpada desligada");
	}

}
