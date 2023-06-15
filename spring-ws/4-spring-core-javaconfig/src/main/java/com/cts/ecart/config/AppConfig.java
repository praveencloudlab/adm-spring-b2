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
@Scope(value = "prototype")
public class AppConfig {
	
	public AppConfig() {
		System.out.println(">>>1.AppConfig object created on "+System.identityHashCode(this));
	}
	
	@PostConstruct
	public void f1() {
		System.out.println(">>>2.PostConstruct :: f1 on "+System.identityHashCode(this));
	}
	
	@PostConstruct
	public void f2() {
		System.out.println(">>>2.PostConstruct :: f2  on "+System.identityHashCode(this));
	}
	
	@Bean // never work for lazy init
	public void f3() {
		//...
		System.out.println(">>>3.Bean :: f3  on "+System.identityHashCode(this));
	}
	
	@Bean // never work for lazy init
	public void f4() {
		//....
		System.out.println(">>>3.Bean :: f4 on "+System.identityHashCode(this));
	}
	
	@PreDestroy // never works on scope type :: prototype
	public void f5() {
		System.out.println(">>>4.PreDestroy :: f5  on "+System.identityHashCode(this));
	}
	
	

}
