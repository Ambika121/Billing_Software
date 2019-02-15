package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductCodeNotAvailableException;

//interface from  where Product DAO is implemented
public interface IProductDAO {

	Product getProductDetails(int productCode) throws ProductCodeNotAvailableException;

}