package com.spring.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.model.Product;

//use appropriate annotation
@Component
public class ProductBO {

	/* This method should calculate the bill amount and return the same to the productService class */
	
	public double calculateBill(Product furObj,String woodType) {
		double amount=0.0;
		// fill the code
		if(woodType.equalsIgnoreCase("Teak"))
			amount=furObj.getMrpValue()-(0.03*furObj.getMrpValue());
		else if(woodType.equalsIgnoreCase("Sheesham"))
			amount=furObj.getMrpValue()-(0.05*furObj.getMrpValue());
		else if(woodType.equalsIgnoreCase("RubberWood"))
			amount=furObj.getMrpValue()-(0.02*furObj.getMrpValue());
		else if(woodType.equalsIgnoreCase("Wenge"))
			amount=furObj.getMrpValue()-(0.08*furObj.getMrpValue());
		else if(woodType.equalsIgnoreCase("Pine"))
			amount=furObj.getMrpValue()-(0.04*furObj.getMrpValue());
		return amount;
	}

}
