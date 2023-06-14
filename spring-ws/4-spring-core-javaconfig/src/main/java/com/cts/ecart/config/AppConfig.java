package com.cts.ecart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
//@ComponentScan(basePackages = {"com.cts.ecart.repository,com.cts.ecart.service"})
@Lazy(value = false)
@Scope(value = "singleton")
public class AppConfig {
	
	public AppConfig() {
		System.out.println(">>>1.AppConfig object created..");
	}
	
	@PostConstruct
	public void f1() {
		System.out.println(">>>2.PostConstruct :: f1");
	}
	
	@PostConstruct
	public void f2() {
		System.out.println(">>>2.PostConstruct :: f2");
	}
	
	@Bean // never work for lazy init
	public void f3() {
		System.out.println(">>>3.Bean :: f3");
	}
	
	@Bean // never work for lazy init
	public void f4() {
		System.out.println(">>>3.Bean :: f4");
	}
	
	@PreDestroy // never works on scope type :: prototype
	public void f5() {
		System.out.println(">>>4.PreDestroy :: f5");
	}
	
	

}
