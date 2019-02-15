package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.ProductCodeNotAvailableException;
import com.capgemini.takehome.exception.QuantityNotValidException;

public interface IProductService {

	Product getProductDetails(int productCode, int quantity)
			throws ProductCodeNotAvailableException, InvalidProductCodeException, QuantityNotValidException;

}