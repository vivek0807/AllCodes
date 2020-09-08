package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

//@Controller
public class HelpController {

    @Autowired
    private HelperService helpService;

    @RequestMapping(value = "/showpage",method = RequestMethod.GET)
    public String showPage(@ModelAttribute("helper")  HelperBean helperBean,BindingResult result){

        return "showpage";
    }

    @ModelAttribute("serviceList")
    public Map<String,String> buildState(){
        Map<String,String> map=new HashMap<>();
        map.put("ACService","ACService");
        map.put("WashingMachineService","WashingMachineService");
        map.put("RefrigeratorService","RefrigeratorService");
        return map;
    }




    @RequestMapping (value="/helpdesk",method = RequestMethod.POST)
    public String calculateTotalCost(@ModelAttribute("helper")HelperBean helperBean,BindingResult result){

        System.out.println("Inside submit login");
      //  double cost=helpService.calculateTotalCost(helperBean);
     //   System.out.println(cost);
        //model.addAttribute("cost",cost);
        return "helpdesk";
    }
}
/*
FUNCTIONAL TEST CASE FAILED
Fail 1 - testShowPage
Request Mapping from index page to showpage is not done as per the requirement
Fail 2 - testCalculateTotalCostInvocation
Request Mapping from  showpage to helpdesk page not done as per the requirement
Fail 3 - testModelObjectForCalculateTotalCost
Check whether the Request URL/Request Method type/ Model Attribute Name used is as per the problem statement
USER INTERFACE TEST CASE FAILED
Fail 1 - testSuccessFlowForWashingMachineHelpService
Fail 2 - testSuccessFlowACHelpService
Fail 3 - testshowpageJSP
Fail 4 - testSuccessFlowForRefrigeratorHelpService
* */