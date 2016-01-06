package com.lin.maven05_webapp.helloworld.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	public static Logger logger = Logger.getLogger(HelloWorldController.class);
	
	@RequestMapping("/sayHelloWorld")
	public String sayHelloWorld() {
		System.out.println("Hello World!");
		
		logger.error("log4j --- error");
		logger.warn("log4j --- warn");
		logger.info("log4j --- info");
		logger.debug("log4j --- debug");
		
		return "success";
	}
}
