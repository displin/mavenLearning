package com.lin.maven01.model;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldTest {
	
	@Test
	public void testSayHello() {
		Assert.assertEquals("Hello World!", new HelloWorld().sayHello());
	}
}