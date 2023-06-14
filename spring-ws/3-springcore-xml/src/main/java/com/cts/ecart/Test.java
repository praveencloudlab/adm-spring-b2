package com.cts.ecart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ecart.service.ProductServiceImpl;
import com.cts.ecart.service.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(">> main method");
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
	
		
		//ProductServiceImpl ps=(ProductServiceImpl)ac.getBean("p1");
		//ProductServiceImpl ps = ac.getBean("p1",ProductServiceImpl.class);
		
		ProductServiceImpl ps1 = ac.getBean(ProductServiceImpl.class);
		//ProductServiceImpl ps2 = ac.getBean(ProductServiceImpl.class);
		
		UserServiceImpl userService = ac.getBean(UserServiceImpl.class);
		
		
		/*
		 * steps to save object in database
		 * 1.call service method
		 * 2.call repository method from service method
		 * 
		 */
		
		ps1.save();
		userService.display();
		//ps2.save();

		
		
	}

}
