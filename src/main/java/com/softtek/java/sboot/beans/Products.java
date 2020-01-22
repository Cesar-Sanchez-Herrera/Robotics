package com.softtek.java.sboot.beans;


public class Products {

	private String productName;
	private String description;

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {

	}
	
	@Override
	public String toString() {
		return "Products [productName=" + productName + ", description=" + description + "]";
	}
	
	public Products(String productName, String description) {
		super();
		this.productName = productName;
		this.description = description;
	}
	
	
}
