package com.j6d9.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.j6d9.entity.Product;


public interface ProductDao extends JpaRepository<Product, Integer> {
	
	
	@Query("SELECT p FROM Product p WHERE p.category.id=?1")
	List<Product> findByCategoryId(String cid);

}
