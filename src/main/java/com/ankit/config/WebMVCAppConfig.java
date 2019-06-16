package com.ankit.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;


@Configuration
@ComponentScan(basePackages="com.ankit.controller")
public class WebMVCAppConfig {
   
   @Bean
   public HandlerMapping createSUHM() {
	   SimpleUrlHandlerMapping suhm=null;
	   Properties prop=null;
	   suhm=new SimpleUrlHandlerMapping();
	   //create Properties object
	   prop=new Properties();
	   prop.put("/welcome.htm","pvc");
	   suhm.setMappings(prop);
	   suhm.setOrder(65535);
	   return suhm;   
   }
   
   @Bean(name="pvc")
   public Controller createPVC() {
	   ParameterizableViewController pvc=null;
	   pvc=new ParameterizableViewController();
	   pvc.setViewName("welcome");
	   return pvc;   
   }
   
}
