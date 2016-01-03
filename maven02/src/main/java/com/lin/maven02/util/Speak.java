package com.lin.maven02.util;

import com.lin.maven01.model.HelloWorld;

public class Speak {
	
	public String sayHi() {
		return 	new HelloWorld().sayHello();
	}
}