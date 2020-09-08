package com.spring.main;

import com.spring.config.ApplicationConfig;
import com.spring.service.DoctorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		// fill the code
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		DoctorService ps=(DoctorService) ctx.getBean("doctorService");
		System.out.println("Enter doctor name:");
		String name=in.nextLine();
		System.out.println("Enter doctor phone number:");
		String phone=in.nextLine();
		System.out.println("Enter doctor specialization:");
		String spl=in.nextLine();
		System.out.println("Does doctor provide any concession:(Yes/No)");
		String ques=in.nextLine();
		System.out.println("Enter the surgery Name:");
		String surg = in.nextLine();
		System.out.println("Amount to be paid:"+ps.calculateBill(name,phone,spl,ques,surg));
	}

}
