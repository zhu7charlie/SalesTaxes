package com.charlie.it;

import static org.junit.Assert.assertEquals;

import com.charlie.it.SalesTaxes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalesTaxesDefinitions {
	
	SalesTaxes st;
	
	@Given("^inputfile1 \"([^\"]*)\"$")
	public void inputfile1(String arg1) {
		st = new SalesTaxes( arg1 );
	}
	@Then("^Sales Taxes1 \"([^\"]*)\", Total1 \"([^\"]*)\"$")
	public void sales_Taxes1_Total1(String arg1, String arg2) {
		assertEquals(String.format("%.2f", st.total_taxes), arg1);
		assertEquals(String.format("%.2f", st.total_costs), arg2);
	}
	
	@Given("^inputfile2 \"([^\"]*)\"$")
	public void inputfile2(String arg1) {
		st = new SalesTaxes( arg1 );
	}
	@Then("^Sales Taxes2 \"([^\"]*)\", Total2 \"([^\"]*)\"$")
	public void sales_Taxes2_Total2(String arg1, String arg2) {
		assertEquals(String.format("%.2f", st.total_taxes), arg1);
		assertEquals(String.format("%.2f", st.total_costs), arg2);
	}
	
	@Given("^inputfile3 \"([^\"]*)\"$")
	public void inputfile3(String arg1) {
		st = new SalesTaxes( arg1 );
	}
	@Then("^Sales Taxes3 \"([^\"]*)\", Total3 \"([^\"]*)\"$")
	public void sales_Taxes3_Total3(String arg1, String arg2) {
		assertEquals(String.format("%.2f", st.total_taxes), arg1);
		assertEquals(String.format("%.2f", st.total_costs), arg2);
	}
	
}
