package com.aramark.rsr.exception.type;

public class ServiceException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ServiceException(String error){
		super(error + "custom");
	}
	
	
}
