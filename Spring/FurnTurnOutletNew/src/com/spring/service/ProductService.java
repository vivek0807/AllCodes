package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.bo.ProductBO;
import com.spring.config.ApplicationConfig;
import com.spring.model.Product;




// use appropriate annotation
@Component
public class ProductService {

	// use appropriate annotation
	@Autowired
	private ProductBO productBOObj;

	public ProductBO getProductBOObj() { return productBOObj; }

	public void setProductBOObj(ProductBO productBOObj) {this.productBOObj = productBOObj;}


	/* This method has to assign the values of productId,productName,mrpValue,dimension and woodType to the Product object sObj 
	and invoke calculateBill method in ProductBO class by passing Product object sObj */

	public double calculateBill(String productId,String productName,double mrpValue,String dimension, String woodType) {

			double amount=0.0;
			ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
			Product sObj=(Product)ctx.getBean("product");
			sObj.setDimension(dimension);
			sObj.setProductName(productName);
			sObj.setMrpValue(mrpValue);

			// fill the code

			amount=productBOObj.calculateBill(sObj,woodType);
			return amount;
		
	}

}
