package com.cts.ecart.repository;

public class ProductRepositoryImpl {
	public ProductRepositoryImpl() {
		System.out.println(">>> ProductRepositoryImpl object created on "+System.identityHashCode(this));
	}
	
	public void saveProduct() {
		System.out.println(">>>ProductRepositoryImpl :: saving to database on "+System.identityHashCode(this));
	}

}
