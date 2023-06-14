package com.cts.ecart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.ecart.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		System.out.println("main method");
		
		AbstractApplicationContext ac= new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppConfig config = ac.getBean(AppConfig.class);
		
		ac.close();

	}

}
