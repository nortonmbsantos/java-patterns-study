package com.norton.patterns_project.extra;

public class ExtraDecorator implements Extra{

	public Extra extra;
	
	public ExtraDecorator(Extra extra) {
		this.extra = extra;
	}
	
	  @Override
	  public void mount(){
	    this.extra.mount();
	  }
	
}
