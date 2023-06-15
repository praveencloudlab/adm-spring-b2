package com.cts.ecart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.ecart.config.AppConfig;
import com.cts.ecart.service.ProductService;
import com.cts.ecart.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductService ps = ac.getBean(ProductService.class);
		ps.save();
		ac.close();

	}

}
