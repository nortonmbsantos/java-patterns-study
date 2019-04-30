package com.norton.patterns_project.extra;

public class Chantilly extends ExtraDecorator{
	
	public Chantilly(Extra extra) {
		super(extra);
	}
	
	  @Override
	  public void mount(){
	    super.mount();
	    System.out.println("Adicionando chantilly no seu café!");
	  }
	
}
