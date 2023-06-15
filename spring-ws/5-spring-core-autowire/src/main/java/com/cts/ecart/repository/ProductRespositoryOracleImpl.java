package com.cts.ecart.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository

public class ProductRespositoryOracleImpl implements ProductRepository {

	@Override
	public void save() {
		System.out.println("ORACLE-Repo:: saving to ORACLE DB");
	}
	
	@Override
	public void listAll() {
		System.out.println("ORACLE-Repo:: pulling records from ORACLE DB");
	}

}
