package com.tns.encapsulation;

public class Product {
	private int productId;
	private String productName;
	private double price;
	
	
    public void setProductDetails(int productId, String productName, double price) {
    	this.productId = productId;
    	this.productName = productName;
    	if (price > 0) {
    		this.price = price;
    	} else {
    		System.out.println("Invalid price! Setting price to 0.");
    		this.price = 0;
    	}
    }
    
    public void getProductDetails() {
    	System.out.println("ProductID:" +productId);
    	System.out.println("Product Name:" + productName);
    	System.out.println("Price:" + price);
    }
    
    public class Main{
    	public static void main(String[] args) {
    		Product p = new Product();
    		p.setProductDetails(101,"Laptop",55000);
    		p.getProductDetails();
    	}
    }
}
