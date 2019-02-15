package com.capgemini.takehome.exception;

public class QuantityNotValidException extends Exception {
	
	@Override
	public String getMessage()
	{
		return("Quantity can't be Zero or Negative");
	}

}
