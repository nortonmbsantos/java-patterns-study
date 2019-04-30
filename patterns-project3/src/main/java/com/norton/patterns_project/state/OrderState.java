package com.norton.patterns_project.state;

public interface OrderState {
	
	OrderState next();

	OrderState back();
	
	OrderState cancel();

}
