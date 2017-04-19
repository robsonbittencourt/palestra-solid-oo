package com.solid.oo.encapsulamento.bom;

public class CalculoSalarioDesenvolvedor implements CalculoSalario {

	@Override
	public double calcularSalario(Funcionario funcionario) {
		return funcionario.getSalarioBase() * 1.1;
	}

}
