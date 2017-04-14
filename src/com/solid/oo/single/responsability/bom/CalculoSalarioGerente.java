package com.solid.oo.single.responsability.bom;

import com.solid.oo.single.responsability.ruim.Funcionario;

public class CalculoSalarioGerente implements CalculoSalario {
	
	@Override
	public double calcularSalario(Funcionario funcionario) {
		return funcionario.getSalarioBase() * 1.3;
	}

}
