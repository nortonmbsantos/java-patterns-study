package com.norton.patterns_project.state;

import com.norton.patterns_project.extra.Extra;

public class DeliverOrder implements OrderState{

	@Override
	public OrderState next() {
		
		return null;
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
