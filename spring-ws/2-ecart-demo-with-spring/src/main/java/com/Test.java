package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P01", "P02", "P03" };
		String[] cart2 = { "P01"};

		
		/*
		//============================================
		PriceMattrixImpl price=new PriceMattrixImpl(); // dependency object
		//============================================

		BillingImpl biller = new BillingImpl(); // dependent object
		
		biller.setPrice(price); // injecting dependency object (price) to the dependent object (biller) is called dependency injection
		
		
		*/
		
		 ApplicationContext ac= new AnnotationConfigApplicationContext(AppConfig.class);
		
		 BillingImpl biller = ac.getBean(BillingImpl.class);
		
		
		
		//---------------------------------------------------------
		
		
		// BL 
		
		double total = biller.getCartTotal(cart1);
		System.out.println("Cart1 Total is " + total);
		
		
		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 Total is " + total);
		
		//---------------------------------------------------------

	}

		

}
