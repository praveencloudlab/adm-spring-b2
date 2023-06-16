package com.cts.ecart.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ecart.entity.Product;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class ProductRepositoryImpl {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	//find Product By ID
	@Transactional
	public Product findByProductId(int productId) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(Product.class, productId);
	}
	
	
	//list all products
	@Transactional
	public List<Product> listAll(){
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

}
