package com.capgemini.takehome.dao;

import java.util.Iterator;
import java.util.Map;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductCodeNotAvailableException;
import com.capgemini.takehome.util.CollectionUtil;

//implimented from IProductDAO
public class ProductDAO implements IProductDAO {
	
	@Override
	public Product getProductDetails(int productCode) throws ProductCodeNotAvailableException
	{
		Map<Integer, Product> product = CollectionUtil.getProducts();
		//Iterator to iterate in HashMap
		Iterator<Product> iterator = product.values().iterator();
		
		//If product ID matched then return the product else throw exception
		while(iterator.hasNext())
		{
			Product Code = iterator.next();
			if(Code.getProduct_Id() == productCode)
			{
				return Code;
			}
		}
		throw new ProductCodeNotAvailableException(productCode);
	}

}
