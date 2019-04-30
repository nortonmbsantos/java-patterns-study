package com.norton.patterns_project.state;

import com.norton.patterns_project.extra.Extra;

public class PaymentOrder implements OrderState{

	Extra extra;
	
	public PaymentOrder(Extra extra) {
		this.extra = extra;
	}
	
	@Override
	public OrderState next() {
		System.out.println("Confirmando pagamento!");
		return new ConfirmationOrder(extra);
	}

	@Override
	public OrderState back() {
		
		return null;
	}

	@Override
	public OrderState cancel() {
		System.out.println("Cancelando pedido!");
		return new CanceledOrder();
	}

}
