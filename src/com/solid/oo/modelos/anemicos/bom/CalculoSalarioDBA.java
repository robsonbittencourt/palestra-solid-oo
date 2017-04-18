package com.solid.oo.modelos.anemicos.bom;

public class CalculoSalarioDBA implements CalculoSalario {
	
	@Override
	public double calcularSalario(Funcionario funcionario) {
		return funcionario.getSalarioBase() * 1.2;
	}
	
}
