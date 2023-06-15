package com.cts.ecart.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.ecart.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	
	@Autowired
	//@Qualifier(value  ="productRespositoryOracleImpl")
	@Qualifier(value = "productRespositoryMySQLImpl")
	private ProductRepository dbRepo;
	
	@Override
	public void save() {
		System.out.println("Service:: save method");
		dbRepo.save();
	}
	
	
	
	
}
