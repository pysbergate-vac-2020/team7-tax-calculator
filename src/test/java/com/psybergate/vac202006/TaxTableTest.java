package com.psybergate.vac202006;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxTableTest {

	@Test
	void testnotax () {
		TaxTable2 jtest = new TaxTable2(70000);
		double amount = jtest.totalPayableTax();
		assertEquals(0,amount);	
	}
	
	@Test	
	void testbracket1() {
		TaxTable2 jtest = new TaxTable2(80000);
		assertEquals(14400.0,jtest.totalPayableTax());
	}
	
	@Test	
	void testbracket2() {
		TaxTable2 jtest = new TaxTable2(215900);
		assertEquals(39662,jtest.totalPayableTax());
	} 
	
	@Test	
	void testbracket3() 
	{
		TaxTable2 jtest = new TaxTable2(445100);
		assertEquals(105429,jtest.totalPayableTax());
	} 
	
	@Test	
	void testbracket4() 
	{
		TaxTable2 jtest = new TaxTable2(584200);
		assertEquals(155505,jtest.totalPayableTax());
	} 
	
	@Test	
	void testbracket5() 
	{
		TaxTable2 jtest = new TaxTable2(744800);
		assertEquals(218139,jtest.totalPayableTax());
	} 
	
	@Test
	void testbracket6() 
	{
		TaxTable2 jtest = new TaxTable2(1577300);
		assertEquals(559464,jtest.totalPayableTax());
	}
	
	@Test
	void testbracket7() 
	{
		TaxTable2 jtest = new TaxTable2(1577302);
		assertEquals(559465,jtest.totalPayableTax());
	} 
}
