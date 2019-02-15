package com.capgemini.takehome.exception;

public class ProductCodeNotAvailableException extends Exception {
	
	int productCode;

	public ProductCodeNotAvailableException(int productCode) {
		super();
		this.productCode = productCode;
	}
	
	@Override
	public String getMessage()
	{
		return("Sorry! The product code " + productCode + " is not available");
	}

}
