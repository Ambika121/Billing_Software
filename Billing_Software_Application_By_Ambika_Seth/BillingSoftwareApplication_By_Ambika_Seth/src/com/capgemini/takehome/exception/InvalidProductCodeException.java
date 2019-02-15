package com.capgemini.takehome.exception;

public class InvalidProductCodeException extends Exception {
	
	@Override
	public String getMessage()
	{
		return("Product Code id Invalid");
	}

}
