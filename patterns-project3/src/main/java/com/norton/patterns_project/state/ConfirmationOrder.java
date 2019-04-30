package com.norton.patterns_project.state;

import com.norton.patterns_project.extra.Extra;

public class ConfirmationOrder implements OrderState{

	Extra extra;
	
	public ConfirmationOrder(Extra extra) {
		this.extra = extra;
	}
	
	@Override
	public OrderState next() {
		extra.mount();
		return new PreparingOrder(extra);
	}

	@Override
	public OrderState back() {
		System.out.println("Reembolsando pagamento!");
		return new RefoundOrder();
	}

	@Override
	public OrderState cancel() {
		System.out.println("Reembolsando pagamento!");
		return new RefoundOrder();
	}

}
