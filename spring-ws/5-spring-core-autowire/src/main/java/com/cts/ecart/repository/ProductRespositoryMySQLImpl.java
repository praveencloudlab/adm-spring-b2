package com.cts.ecart.repository;
import org.springframework.stereotype.Repository;
@Repository
//@Primary
public class ProductRespositoryMySQLImpl implements ProductRepository {

	@Override
	public void save() {
		System.out.println("MYSQL-Repo:: saving to MYSQL DB");
	}
	
	@Override
	public void listAll() {
		System.out.println("MySQL-Repo:: pulling records from MYSQL DB");
	}

}
