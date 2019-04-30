package com.norton.patterns_project.extra;

public class Acucar extends ExtraDecorator{
	
	public Acucar(Extra extra) {
		super(extra);
	}
	
	  @Override
	  public void mount(){
	    super.mount();
	    System.out.println("Adicionando Açúcar no seu café!");
	  }
}
