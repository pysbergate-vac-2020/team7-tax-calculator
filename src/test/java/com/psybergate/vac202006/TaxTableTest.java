package com.psybergate.vac202006;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxTableTest {

	@Test
	void testnotax () {
		TaxTable jtest = new TaxTable(70000);
		double amount = jtest.calctax();
		assertEquals(0,amount);	
	}
	
	@Test	
	void testbracket1() {
		TaxTable jtest = new TaxTable(80000);
		assertEquals(14400.0,jtest.calctax());
	}
	
	@Test	
	void testbracket2() {
		TaxTable jtest = new TaxTable(215900);
		assertEquals(39662,jtest.calctax());
	} 
	
	@Test	
	void testbracket3() 
	{
		TaxTable jtest = new TaxTable(445100);
		assertEquals(105429,jtest.calctax());
	} 
	
	@Test	
	void testbracket4() 
	{
		TaxTable jtest = new TaxTable(584200);
		assertEquals(155505,jtest.calctax());
	} 
	
	@Test	
	void testbracket5() 
	{
		TaxTable jtest = new TaxTable(744800);
		assertEquals(218139,jtest.calctax());
	} 
	
	@Test
	void testbracket6() 
	{
		TaxTable jtest = new TaxTable(1577300);
		assertEquals(559464,jtest.calctax());
	}
	
	@Test
	void testbracket7() 
	{
		TaxTable jtest = new TaxTable(1577302);
		assertEquals(559465,jtest.calctax());
	} 
}
