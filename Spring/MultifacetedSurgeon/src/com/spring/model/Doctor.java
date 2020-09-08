package com.spring.model;

import org.springframework.stereotype.Component;

// use appropriate annotation
@Component
public class Doctor {
 
	private String doctorName;
	private String doctorPhNumber; 
	private String specialization;
	private String concession;
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorPhNumber() {
		return doctorPhNumber;
	}
	public void setDoctorPhNumber(String doctorPhNumber) {
		this.doctorPhNumber = doctorPhNumber;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getConcession() {
		return concession;
	}
	public void setConcession(String concession) {
		this.concession = concession;
	}
	
	
}

