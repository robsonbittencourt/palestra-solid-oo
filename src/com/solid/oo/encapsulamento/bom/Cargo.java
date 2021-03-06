package com.solid.oo.encapsulamento.bom;

public enum Cargo {
	
	DBA(new CalculoSalarioDBA()),
	GERENTE(new CalculoSalarioGerente()),
	DESENVOLVEDOR(new CalculoSalarioDesenvolvedor());
	
	private CalculoSalario calculoSalario;
	
	private Cargo(CalculoSalario calculoSalario) {
		this.calculoSalario = calculoSalario;
	}
	
	public CalculoSalario getCalculo() {
		return calculoSalario;
	}
}
