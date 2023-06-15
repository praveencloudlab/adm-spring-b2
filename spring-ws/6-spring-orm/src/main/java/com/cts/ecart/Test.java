package com.cts.ecart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.ecart.config.AppConfig;
import com.cts.ecart.entity.Product;
import com.cts.ecart.repository.ProductRepositoryImpl;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductRepositoryImpl prodRepo = ac.getBean(ProductRepositoryImpl.class);
		//prodRepo.listAll().forEach(System.out::println);
		
		
		Product prod = prodRepo.findByProductId(1);
		if(prod!=null) {
			System.out.println(prod);
		}else {
			System.out.println("Product ID not found");
		}
		
	}

}
