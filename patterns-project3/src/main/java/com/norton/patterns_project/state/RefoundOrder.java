package com.norton.patterns_project.state;

public class RefoundOrder implements OrderState{

	@Override
	public OrderState next() {
		return new CanceledOrder();
	}

	@Override
	public OrderState back() {
		return null;
	}

	@Override
	public OrderState cancel() {
		return null;
	}

}
