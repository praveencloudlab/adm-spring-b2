package com.cts.ecart.service;

import com.cts.ecart.repository.ProductRepositoryImpl;

public class ProductServiceImpl {

	private ProductRepositoryImpl productRepository;
	
	//private ProductRepositoryImpl prodRepository;

	/*
	public ProductServiceImpl(ProductRepositoryImpl productRepository) {
		System.out.println(">>> ProductServiceImpl object on "+System.identityHashCode(this));
		this.productRepository = productRepository;
	}


	/*

	public void setProdRepository(ProductRepositoryImpl prodRepository) {
		this.prodRepository = prodRepository;
	}
	*/



	public ProductServiceImpl() {
		System.out.println(">>>ProductServiceImpl object created on " + System.identityHashCode(this));
	}

	public void setProductRepository(ProductRepositoryImpl productRepository) {
		this.productRepository = productRepository;
	}

	public void f1() {
		System.out.println();
	}

	public void save() {
		
		System.out.println(">>>ProductServiceImpl :: saving product ");
		// invoke ProductRepository save method
		productRepository.saveProduct();
	    //prodRepository.saveProduct();
	}

}
