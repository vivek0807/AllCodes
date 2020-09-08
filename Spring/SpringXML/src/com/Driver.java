package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        model md=(model)ctx.getBean("modelObj");
        System.out.println(md.getParamC().get("Hi"));

    }
}
