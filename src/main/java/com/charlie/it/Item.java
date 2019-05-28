package com.charlie.it;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.MatchResult;


public class Item {

	static final float GENERAL_RATE = 0.10f;
	static final float IMPORTED_RATE = 0.05f;
	
	private String lineItem;
	private int quntity;
	private float price;
	private String category;
	private boolean isBook, isFood, isMedical, isImported, isValidItem;
	private float tax;
	private float rounded_tax;
	private float cost;
	

	public Item() {}
	
	public Item( String lineItem ) {
		this.lineItem = lineItem.trim();
		//isValidItem = parseLineItem();
		isValidItem = parseLineItem_regexp();
		if( isValidItem ) {
			checkCategory();
			calculateTax();
			roundTax();
			calculateCost();
		}
	}
	

	private void checkCategory() {
		isBook = isFood = isMedical = isImported = false;
		if( category.toLowerCase().contains("book")) {
			isBook = true;
		} else if( category.toLowerCase().contains("food") || category.toLowerCase().contains("chocolate") ) {
			isFood = true;
		} else if( category.toLowerCase().contains("headache") || category.toLowerCase().contains("pills") ) {
			isMedical = true;
		} 
		if( category.toLowerCase().contains("imported") ) {
			isImported = true;		
		}
	}
	
	private void calculateTax() {
		
		float basic_tax = 0.00f;
		float imported_tax = 0.00f;
		
		if( !isBook && !isFood && !isMedical ) {
			basic_tax = quntity * price * Item.GENERAL_RATE;
		}		
		if( isImported ) {
			imported_tax = quntity * price * Item.IMPORTED_RATE;
		}
		tax = basic_tax + imported_tax;
	}

	private void roundTax() {
		rounded_tax =  (float) Math.ceil( tax/0.05f) * 0.05f;
	}
	
	private void calculateCost() {
		cost =  quntity * price + rounded_tax;
	}
	
	
	public boolean getIsValidItem() { return isValidItem; }
	
	
	@SuppressWarnings("unused")
	private boolean parseLineItem() {
    	String[] elms = lineItem.split(" at ");   		
    	
    	if(elms.length == 2) {
	    	String quntity_category = elms[0];
	    	
    		int firstSpace_index = quntity_category.indexOf(' ');
    		if( firstSpace_index == -1 ) {
    			return false;
    		} else {
    			String firstElem = quntity_category.substring(0, firstSpace_index);
    	    	if( firstElem.matches("\\d+") ) {
    	    		quntity = Integer.parseInt(firstElem);
    	    	} else {
    	    		return false;
    	    	}
    			category = quntity_category.substring(firstSpace_index).trim();
    		}
	    	
	    	if( elms[1].matches("\\d+[\\.,]?\\d*") ) {
	    		price = Float.parseFloat(elms[1]);
	    	} else {
	    		return false;
	    	}
    	} else {
    		return false;
    	}
		return true;
	}
	
	
	private boolean parseLineItem_regexp() {
	    //Scanner sc = new Scanner("20 Something import book at 2.11");
		try( Scanner sc = new Scanner(lineItem) ) {
		    sc.findInLine("^(\\d+)\\s+(.*)\\s+at\\s+(\\d+[\\.,]?\\d*)$");
		    MatchResult result = sc.match();
		    quntity = Integer.parseInt(result.group(1));
		    category = result.group(2);
		    price = Float.parseFloat(result.group(3));
		    //System.out.println("float:" + price + ", int:" + quntity + ", String:" + category );
		} catch ( RuntimeException ex ) {
			return false;
		}
		return true;
	}

	public void printItem() {
		System.out.printf( quntity + " " + category + ": %.2f\n", cost );
	}
	
		
	@Override
	public String toString() {
		return "quntity:" + quntity + ", category:" + category + ", price:" + price + ", tax:" + tax + ", rounded_tax:" + rounded_tax+ ", cost:" + cost;
	}
	

	public float getRounded_tax() {
		return rounded_tax;
	}
	public float getCost() {
		return cost;
	}


}
