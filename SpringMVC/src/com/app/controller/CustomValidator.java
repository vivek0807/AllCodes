package com.app.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class CustomValidator implements Validator {
    public boolean supports(Class clazz) {
     return   RegistrationBean.class.equals(clazz);
    }

    @Override
    public void validate(Object arg0, Errors arg1){
        RegistrationBean rb=(RegistrationBean)arg0;

       // arg1.rejectValue("userName","Cannot Be Blank");
        if(rb.getUserName().equals(""))
            arg1.rejectValue("userName","","User Name cannot be blank");
        if(rb.getContactNumber()<1000000000||rb.getContactNumber()>9999999999.0)
            arg1.rejectValue("contactNumber","","Contact Number should be of 10 digits/Contact Number should not be blank");
        if(rb.getEmailId().equals(""))
            arg1.rejectValue("emailId","","Email Id cannot be blank \n Should be a proper email ID format");
        if(rb.getConfirmEmailId().equals(""))
            arg1.rejectValue("confirmEmailId","","Confirm Email Id cannot be blank \n Should be a proper email ID format");
        if(!rb.getEmailId().equals(rb.getConfirmEmailId()))
            arg1.rejectValue("confirmEmailId","","Confirm Email Id cannot be blank \n Should be a proper email ID format");
        if(!rb.isStatus())
            arg1.rejectValue("status","","please agree to the terms and conditions");
       // System.out.println("unable to reach");

    }
}
