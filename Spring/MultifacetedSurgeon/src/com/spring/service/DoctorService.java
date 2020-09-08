package com.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.bo.DoctorBO;
import com.spring.config.ApplicationConfig;
import com.spring.model.Doctor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


// use appropriate annotation
@Component
public class DoctorService  {

	// use appropriate annotation
	@Autowired
	private DoctorBO doctorBOObj;
	

	public DoctorBO getDoctorBOObj() {
		return doctorBOObj;
	}

	public void setDoctorBOObj(DoctorBO doctorBOObj) {
		this.doctorBOObj = doctorBOObj;
	}


	/* This method has to assign the values of doctorName,doctorPhNumber,specialization,concession and surgeryName to the Doctor object sObj 
	and invoke calculateBill method in DoctorBO class by passing Doctor object sObj */
	public double calculateBill(String doctorName,String doctorPhNumber,String specialization,String concession,String surgeryName) 
	{
			double amount=0.0;
			ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
			Doctor sObj=(Doctor)ctx.getBean("doctor");
			sObj.setDoctorName(doctorName);
			sObj.setDoctorPhNumber(doctorPhNumber);
			sObj.setSpecialization(specialization);
			sObj.setConcession(concession);

			// fill the code
		amount=doctorBOObj.calculateBill(sObj,surgeryName);
			return amount;
		
	}

}
