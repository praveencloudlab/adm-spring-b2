package com.cts.ecart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ecart.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(">> main method");
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
	
		
		//ProductServiceImpl ps=(ProductServiceImpl)ac.getBean("p1");
		//ProductServiceImpl ps = ac.getBean("p1",ProductServiceImpl.class);
		ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		ps.save();

		
		
	}

}
