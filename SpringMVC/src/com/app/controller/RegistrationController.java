package com.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
@Controller
public class RegistrationController {
    @Autowired
    private CustomValidator custValidator;

    @RequestMapping(value ="/registerPage",method = RequestMethod.GET)
    public String registerPage(@ModelAttribute("register")RegistrationBean registrationBean,BindingResult result)
    {
        return "registrationpage";
    }
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setValidator(custValidator);
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String performRegistration(@Valid @ModelAttribute("register")RegistrationBean registrationBean,BindingResult result,ModelMap modelMap){

      //  custValidator.validate(registrationBean,result);
        if(result.hasErrors()){
            return "registrationpage";
        }
        modelMap.addAttribute("name",registrationBean.getUserName());
        modelMap.addAttribute("email",registrationBean.getEmailId());
        return "thankyou";
    }
}
