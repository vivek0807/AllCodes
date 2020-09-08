package com.spring.bo;

import com.spring.model.Doctor;
import org.springframework.stereotype.Component;

//use appropriate annotation
@Component
public class DoctorBO {
	
	/* This method should calculate the bill amount and return the same to the DoctorService class */
	
	public double calculateBill(Doctor doctorObj,String surgeryName) {

		double amount=0.0;
		if(surgeryName.equalsIgnoreCase("Cataract"))
			amount=25500.00;
		else if(surgeryName.equalsIgnoreCase("Hysterectomy"))
			amount=38670.00;
		else if(surgeryName.equalsIgnoreCase("Laparoscopic"))
			amount=150000.00;
		else if(surgeryName.equalsIgnoreCase("Cardio"))
			amount=650000.00;
		else if(surgeryName.equalsIgnoreCase("Neuro"))
			amount=375000.00;

		if(doctorObj.getConcession().equalsIgnoreCase("Yes"))
			amount=amount+0.05*amount;
		else if(doctorObj.getConcession().equalsIgnoreCase("No"))
			amount=amount+0.15*amount;
		// fill the code

		return amount;
	}

}
