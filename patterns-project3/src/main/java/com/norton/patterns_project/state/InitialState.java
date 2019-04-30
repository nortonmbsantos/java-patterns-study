package com.norton.patterns_project.state;

import com.norton.patterns_project.extra.Extra;

public class InitialState implements OrderState{

	Extra extra;
	
	public InitialState(Extra extra) {
		this.extra = extra;
	}
	
	@Override
	public OrderState next() {
		System.out.println("Fazendo pagamento");
		return new PaymentOrder(extra);
	}

	@Override
	public OrderState back() {
		System.out.println("Cencelando pagamento!");
		return new CanceledOrder();
	}

	@Override
	public OrderState cancel() {
		System.out.println("Cancelando pagamento!");
		return new CanceledOrder();
	}

}