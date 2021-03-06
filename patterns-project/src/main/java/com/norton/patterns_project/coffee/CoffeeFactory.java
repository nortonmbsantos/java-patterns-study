package com.norton.patterns_project.coffee;

public class CoffeeFactory {
	public Coffee getCoffee(String type){		
		Coffee coffee = null;	

		type = type.toUpperCase();
		
		if(type.equals("C")){
			return new CoffeeCapuccino();
		}else if(type.equals("N")){
			return new CoffeeNormal();
		}else return null;
	}
}
