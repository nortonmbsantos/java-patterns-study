package com.norton.patterns_project.state;

public class CanceledOrder implements OrderState{

	@Override
	public OrderState next() {
		return null;
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
