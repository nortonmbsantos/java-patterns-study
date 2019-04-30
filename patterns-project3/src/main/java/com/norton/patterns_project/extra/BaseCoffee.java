package com.norton.patterns_project.extra;

import com.norton.patterns_project.coffee.Coffee;

public class BaseCoffee implements Extra{

	Coffee coffee;
	
	public BaseCoffee(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void mount() {
		System.out.println("Adicionando seu " + this.coffee.getName() + " em um copo.");
	}

}
