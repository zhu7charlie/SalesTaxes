package com.charlie.it;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalesTaxesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//System.out.println("START -- testing PROBLEM THREE: MARS ROVERS");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//System.out.println("END -- testing PROBLEM THREE: MARS ROVERS");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSalesTaxes1() {
	    SalesTaxes st1 = new SalesTaxes("input1.txt");
		assertEquals(String.format("%.2f", st1.total_taxes), "1.50");
		assertEquals(String.format("%.2f", st1.total_costs), "29.83");
	}

	@Test
	public void testSalesTaxes2() {
	    SalesTaxes st2 = new SalesTaxes("input2.txt");
		assertEquals(String.format("%.2f", st2.total_taxes), "7.65");
		assertEquals(String.format("%.2f", st2.total_costs), "65.15");
	}

	@Test
	public void testSalesTaxes3() {
	    SalesTaxes st3 = new SalesTaxes("input3.txt");
		assertEquals(String.format("%.2f", st3.total_taxes), "6.70");
		assertEquals(String.format("%.2f", st3.total_costs), "74.68");
	}
	
	
}
