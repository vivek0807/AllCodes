package com.spring.model;

import org.springframework.stereotype.Component;

// use appropriate annotation
@Component
public class Product {

	protected String productId;
	protected String productName; 
	protected double mrpValue;
	private String dimension;
	
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getMrpValue() {
		return mrpValue;
	}
	public void setMrpValue(double mrpValue) {
		this.mrpValue = mrpValue;
	}
		
}

