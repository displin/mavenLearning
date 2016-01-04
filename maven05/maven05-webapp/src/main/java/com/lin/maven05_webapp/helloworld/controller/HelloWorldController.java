package com.lin.maven05_webapp.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/sayHelloWorld")
	public String sayHelloWorld() {
		System.out.println("Hello World!");
		return "success";
	}
}
