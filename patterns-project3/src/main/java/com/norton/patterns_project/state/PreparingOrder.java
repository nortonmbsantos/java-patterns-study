package com.norton.patterns_project.state;

import com.norton.patterns_project.extra.Extra;

public class PreparingOrder implements OrderState{

	Extra extra;
	
	public PreparingOrder(Extra extra) {
		this.extra = extra;
	}
	
	@Override
	public OrderState next() {
		System.out.println("Entragando pedido!");
		return new DeliverOrder();
	}

	@Override
	public OrderState back() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderState cancel() {
		// TODO Auto-generated method stub
		return null;
	}

}
