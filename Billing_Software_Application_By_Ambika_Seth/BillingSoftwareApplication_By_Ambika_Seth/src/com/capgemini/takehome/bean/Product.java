package com.capgemini.takehome.bean;

public class Product {
	
	int product_Id;
	String product_name;
	String product_category;
	int product_price;
	
	//Getter and Setter
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	
	//Constructor
	public Product(int product_Id, String product_name, String product_category, int product_price) {
		super();
		this.product_Id = product_Id;
		this.product_name = product_name;
		this.product_category = product_category;
		this.product_price = product_price;
	}
	
	@Override
	public String toString()
	{
		return("Product Name:        " + product_name + "\nProduct Category:    " + product_category + "\nProduct Price(Rs):   " + product_price);
	}
	
}
