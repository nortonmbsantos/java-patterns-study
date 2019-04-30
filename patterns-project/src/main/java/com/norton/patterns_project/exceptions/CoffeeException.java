package com.norton.patterns_project.exceptions;

public class CoffeeException extends RuntimeException{

	public CoffeeException(String excpetion) {
		super(excpetion);
	}
	
	public CoffeeException(String excption, Throwable cause) {
		super(excption, cause);
	}
}