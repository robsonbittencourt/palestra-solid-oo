package com.solid.oo.isp.bom;

public class ProductOwner implements FuncaoProductOwner {

	@Override
	public void priorizarBacklog() {
		System.out.println("Priorizando backlog com base nas minhas necessidades de negócio");
	}

}
