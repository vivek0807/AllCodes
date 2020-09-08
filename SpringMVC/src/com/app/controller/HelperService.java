package com.app.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
@Component
public class HelperService {
     public double calculateTotalCost(@ModelAttribute("helper") HelperBean helpeBean ){
         if(helpeBean.getServiceType().equals("ACService"))
             return 400*helpeBean.getNoOfHours();
         else if(helpeBean.getServiceType().equals("WashingMachineService"))
             return 500*helpeBean.getNoOfHours();
         else if(helpeBean.getServiceType().equals("RefrigeratorService"))
             return 300*helpeBean.getNoOfHours();
         return 0;
     }
}
