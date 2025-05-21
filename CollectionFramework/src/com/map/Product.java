package com.map;

public class Product {
	
	
	public Product(int productId,String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	
	}
	int productId;
	String productName;
	
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + "]";
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	//getter setter
	
	
	

}
