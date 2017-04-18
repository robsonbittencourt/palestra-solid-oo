package com.solid.oo.modelos.anemicos.bom;

public class CalculoSalarioGerente implements CalculoSalario {
	
	@Override
	public double calcularSalario(Funcionario funcionario) {
		return funcionario.getSalarioBase() * 1.3;
	}

}
