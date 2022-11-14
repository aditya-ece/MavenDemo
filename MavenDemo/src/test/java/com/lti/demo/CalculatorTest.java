package com.lti.demo;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


class CalculatorTest {
 Calculator c=new Calculator();
	@Test
	public void testsayHello() {
		Assertions.assertEquals("Hello", c.sayHello());
		
		
	}
	@Test
	public void testadd() {
		Assertions.assertEquals(100, c.add(60,40),"Check the code again");
	}
	@Test
	void testAssertFalse() 
	{
		Assertions.assertFalse("jeepad".length()==10);
		
		
	}

}
