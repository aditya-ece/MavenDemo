package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExcepEx {

	@Test
    void testExpection() {



       Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("100");
        });
    }
	public void searchEmpId(int empid)
    {
        if(empid==0)
        {
            throw new ArithmeticException("u enetered zero");
        }
        else
        {
            System.out.println(" do something");
        }
        
    }
	 @Test
     void testException1() {



        Calculator c= new Calculator();
         
         final Exception e = assertThrows(ArithmeticException.class, () -> {
             c.searchEmpId(0);
       
       });
         
         
       Assertions.assertEquals("u enetered zero",e.getMessage());
     }

}
