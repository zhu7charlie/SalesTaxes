package com.charlie.it;

/*
 * This is the main class for PROBLEM: SALES TAXES
 * Author: Changhai Zhu (Charlie)
 */
public class mainSalesTaxes {
	
	static {
		//System.out.println("START -- PROBLEM TWO: SALES TAXES");
		System.out.println("OUTPUT");
	}

	public static void main(String args[])  {

        SalesTaxes st1 = new SalesTaxes("input1.txt");
        System.out.println("\nOutput 1:");
        st1.printSalesTaxes();
        
        SalesTaxes st2 = new SalesTaxes("input2.txt");
        System.out.println("\nOutput 2:");
        st2.printSalesTaxes();

        SalesTaxes st3 = new SalesTaxes("input3.txt");
        System.out.println("\nOutput 3:");
        st3.printSalesTaxes();

        System.out.println("=========="); 
		//System.out.println("END -- PROBLEM TWO: SALES TAXES");			
		
	}
	
	
	
	
}
