package com.psybergate.vac202006;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class taxtabletest {

	@Test
	void testnotax () {
		taxtables jtest = new taxtables(70000);
		double amount = jtest.calctax();
		assertEquals(0,amount);
			
	}
	@Test	
	void testbracket1() {
		taxtables jtest = new taxtables(80000);
		assertEquals(14400.0,jtest.calctax());
		
	}
	
	@Test	
	void testbracket2() {
		taxtables jtest = new taxtables(215900);
		assertEquals(39662,jtest.calctax());
		
		
	} 
	

	
	@Test	
	void testbracket3() 
	{
		taxtables jtest = new taxtables(445100);
		assertEquals(105429,jtest.calctax());
		
		
	} 
	
	@Test	
	void testbracket4() 
	{
		taxtables jtest = new taxtables(584200);
		assertEquals(155505,jtest.calctax());
	} 
	
	@Test	
	void testbracket5() 
	{
		taxtables jtest = new taxtables(744800);
		assertEquals(218139,jtest.calctax());
	} 
	
	@Test
	void testbracket6() 
	{
		taxtables jtest = new taxtables(1577300);
		assertEquals(559464,jtest.calctax());
	}
	
	@Test
	void testbracket7() 
	{
		taxtables jtest = new taxtables(1577302);
		assertEquals(559465,jtest.calctax());
	} 
	
	
	
	
	

}
