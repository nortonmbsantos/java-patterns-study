package com.norton.gerenciador_viagens.services.exceptions;

public class ViagemException extends RuntimeException{

	public ViagemException(String excpetion) {
		super(excpetion);
	}
	
	public ViagemException(String excption, Throwable cause) {
		super(excption, cause);
	}
}
