package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//dependent
@Service
public class BillingImpl {
	
	
	/*
	 * Design issues
	 * ================
	 * 
	 * ==> too many dependency objects
	 * 		-> memory management issues
	 * 		-> Performance issues
	 * 
	 * why this issue happened?
	 * =============================
	 * ==> dependent class itself creating dependency class objects
	 * 
	 * what is the solution?
	 * =======================
	 * ==> do not create dependency objects in the dependent class directly
	 * ==> instead use techniques like JNDI
	 * 		-> JNDI location is tightly coupled with dependent class
	 * 
	 * what is the best solution?
	 * =============================
	 * ==> do not create object directly or use any JNDI techniques,
	 * ==> instead of ask some one (container) to inject / pass to the dependent. this is called IoC(inversion of control) 
	 * 
	 * how to implement IoC?
	 * =======================
	 * ==> by using DI (dependency injection technique)
	 * 
	 * What is DI?
	 * ============
	 * ==> injecting or passing dependency object to the dependent object is called dependency injection
	 * 
	 * How to implement this DI?: 2 ways
	 * ====================================
	 * 1.setter based injection
	 * 2.constructor based injection
	 * 
	 * 
	 * 1.setter based injection
	 * ===============================
	 * rules
	 * -----
	 * 1.create reference of a dependency class in the dependent class at class level
	 * 2.create setter for the above defined reference
	 * 
	 * 
	 */
	
	
	@Autowired
	private PriceMattrixImpl price; // dependency

	/*
	//setter
	public void setPrice(PriceMattrixImpl price) {
		this.price = price;
	}
	*/


	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMattrixImpl price = new PriceMattrixImpl(); // dependency object

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;
	}
}
