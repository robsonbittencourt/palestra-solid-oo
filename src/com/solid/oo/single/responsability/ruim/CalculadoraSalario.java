package com.solid.oo.single.responsability.ruim;

import static com.solid.oo.single.responsability.ruim.Cargo.DBA;
import static com.solid.oo.single.responsability.ruim.Cargo.DESENVOLVEDOR;
import static com.solid.oo.single.responsability.ruim.Cargo.GERENTE;

public class CalculadoraSalario {
	
	public double calcularSalario(Funcionario funcionario) {
		if(DBA.equals(funcionario.getCargo())) {
			return funcionario.getSalarioBase() * 1.2;
		}
		
		if(GERENTE.equals(funcionario.getCargo())) {
			return funcionario.getSalarioBase() * 1.3;
		}
		
		if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return funcionario.getSalarioBase() * 1.1;
		}
		
		throw new RuntimeException("funcionário inválido");
	}

}
