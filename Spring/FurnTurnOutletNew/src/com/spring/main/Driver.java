package com.spring.main;

import com.spring.config.ApplicationConfig;
import com.spring.model.Product;
import com.spring.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args)  {

		Scanner in=new Scanner(System.in);
		// fill the code
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ProductService ps=(ProductService)ctx.getBean("productService");

		//System.out.println(ps.getClass());
		System.out.println("Enter the product id:");
		String id=in.nextLine();
		System.out.println("Enter the product name:");
		String name=in.nextLine();
		System.out.println("Enter the mrp value:");
		double mrp=in.nextDouble();
		in.nextLine();
		System.out.println("Enter the dimension details:");
		String dim=in.nextLine();
		System.out.println("Enter the wood type:");
		String type=in.nextLine();

		System.out.println("Amount to be paid is:"+ps.calculateBill(id,name,mrp,dim,type));
	}

}
