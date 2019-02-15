package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.InvalidProductCodeException;
import com.capgemini.takehome.exception.ProductCodeNotAvailableException;
import com.capgemini.takehome.exception.QuantityNotValidException;
import com.capgemini.takehome.service.ProductService;

public class Client {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int choice, productCode, quantity;
		System.out.println("1.Generate Bill by entering Product Code and quantity\n2.Exit");
		choice = scanner.nextInt();
	
		switch(choice)
		{
		case 1: System.out.println("Enter the Product Code ");
		        productCode = scanner.nextInt();
		        System.out.println("Enter the Quantity ");
		        quantity = scanner.nextInt();
		        
		        try
		        {
		        	ProductService productService = new ProductService();
		            Product product = productService.getProductDetails(productCode, quantity);
		            
		            System.out.println(product);
		            
		            System.out.println("Quantity:            " + quantity);
		            System.out.println("Line Total:          " + product.getProduct_price()*quantity);
		        
		        }
		        catch(InvalidProductCodeException exception)
		        {
		        	System.out.println(exception.getMessage());
		        }
		        
		        catch(QuantityNotValidException exception)
		        {
		        	System.out.println(exception.getMessage());
		        }
		        catch(ProductCodeNotAvailableException exception)
		        {
		        	System.out.println(exception.getMessage());
		        }
		        
		        //We are not breaking. So, we exits after printing the bill.
		        
			
		case 2: System.exit(0);
		        //Again break is optional because code is already terminated.
		
		default: System.out.println("Invalid Option");
		}
		
		
		
		scanner.close();
	}
}
