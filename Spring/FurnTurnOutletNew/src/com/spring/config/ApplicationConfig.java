package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// use appropriate annotations
@Configuration
@ComponentScan({"com.spring.model","com.spring.service","com.spring.bo"})
public class ApplicationConfig {

}
