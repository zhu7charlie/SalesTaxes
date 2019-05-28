package com.charlie.it;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SalesTaxes {
	
	String inputfile;
	List<Item> Items;	
	float total_taxes;
	float total_costs;

	SalesTaxes() {}
	
	SalesTaxes( String inputfile ) {
		this.inputfile = inputfile;
		readInputfile();
		total_taxes = (float)Items.stream().mapToDouble(item -> item.getRounded_tax()).sum();
		total_costs = (float)Items.stream().mapToDouble(item -> item.getCost()).sum();
	}

	@SuppressWarnings({ "resource", "unused" })
	private void showInputFile() throws IOException {
		new BufferedReader(new FileReader(new File(inputfile))).lines().forEach(System.out::println);
	}
	
	
	/* read inputfile.txt from the app root */
	private void readInputfile()  {

        try ( Scanner input = new Scanner(new File(inputfile)) ) {

    		Items = new ArrayList<Item>();
    		
	        while( input.hasNextLine()) {
	        	String line = input.nextLine();	        	
	            Item item = new Item( line );
	            if( item.getIsValidItem()) {
	            	Items.add(item);
	            }	            
	        }	        	        
        } catch (IOException e) {
			System.out.println("Got IOException. message=" + e.getMessage() );
        } catch (InputMismatchException e) {
			System.out.println("Got InputMismatchException message=" + e.getMessage() );
        } catch (Exception e) {
			System.out.println("Got Exception. message=" + e.getMessage() );
		} finally {
			//do something ?
		}
	}
	

	public void printSalesTaxes() {
		Items.forEach(item -> item.printItem());
		System.out.printf("Sales Taxes: %.2f\n", total_taxes );
		System.out.printf("Total:  %.2f\n", total_costs );
	}
	
	
	
}
