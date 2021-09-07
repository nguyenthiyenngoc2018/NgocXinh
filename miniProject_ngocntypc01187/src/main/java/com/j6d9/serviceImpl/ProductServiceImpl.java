package com.j6d9.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j6d9.dao.ProductDao;
import com.j6d9.entity.Product;
import com.j6d9.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired 
	ProductDao pdao ;

	@Override
	public List<Product> findAll() {
		return pdao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return pdao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		return pdao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		return pdao.save(product);
	}

	@Override
	public Product update(Product product) {
		return pdao.save(product);
	}

	@Override
	public void delete(Integer id) {
		pdao.deleteById(id);
	}
	
}
