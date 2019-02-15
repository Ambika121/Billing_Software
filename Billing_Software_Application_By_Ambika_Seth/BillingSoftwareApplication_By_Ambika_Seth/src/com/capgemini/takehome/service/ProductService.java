package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.ProductCodeNotAvailableException;
import com.capgemini.takehome.exception.QuantityNotValidException;

//Implemented from IProductService
public class ProductService implements IProductService{
	
	@Override
	public Product getProductDetails(int productCode, int quantity) throws ProductCodeNotAvailableException, InvalidProductCodeException, QuantityNotValidException
	{
		int iterator = 0;
		int productCodeCopy = productCode;
    	while(productCodeCopy > 0)
    	{
    		iterator++;
    		productCodeCopy = productCodeCopy/10;
    	}
    	
    	if(iterator != 4)
    	{
    		throw new InvalidProductCodeException();
    	}
    	
    	if(quantity <= 0)
    	{
    		throw new QuantityNotValidException();
    	}
    	
		ProductDAO productDAO = new ProductDAO();
		return productDAO.getProductDetails(productCode);
	}

}
