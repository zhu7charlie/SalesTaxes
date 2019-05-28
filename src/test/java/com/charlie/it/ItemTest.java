package com.charlie.it;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ItemTest {
	
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
	public void testItem0() { //negative test
		Item st = new Item("NaN book at 12.49");
		assertEquals(st.getIsValidItem(), false);
	}
	
	
	@Test
	public void testItem1() {
		Item st = new Item("1 book at 12.49");
		assertEquals(st.getIsValidItem(), true);
		assertEquals(String.format("%.2f", st.getRounded_tax()), "0.00");
		assertEquals(String.format("%.2f", st.getCost()), "12.49");
	}

	@Test
	public void testItem2() {
		Item st = new Item("1 music CD at 14.99");
		assertEquals(st.getIsValidItem(), true);
		assertEquals(String.format("%.2f", st.getRounded_tax()), "1.50");
		assertEquals(String.format("%.2f", st.getCost()), "16.49");
	}


}
