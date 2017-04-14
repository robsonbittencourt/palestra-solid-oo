package com.solid.oo.dip.bom;

public class Botao {
	
	private Dispositivo dispositivo;
	
	public void acionar() {
		if (dispositivo.isLigado()) {
			dispositivo.ligar();
		} else {
			dispositivo.desligar();
		}
	}

}
