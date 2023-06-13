package com;

import org.springframework.stereotype.Repository;

//dependency
@Repository
public class PriceMattrixImpl {
	
	public PriceMattrixImpl() {
		System.out.println("PriceMattrixImpl object created..");
	}
	
	
	/*
	 * types of java objects? 2 types
	 * =================================
	 * 1.dependency object: words independently. never depends on any other class
	 * 2.dependent object: always depends on dependency objects
	 */
	
	public double getItemPrice(String itemCode) {
		// code to fetch item price of a given item code from database
		
		return 100.00;
	}

}
