package com.j6d9.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j6d9.dao.CategoryDao;
import com.j6d9.entity.Category;
import com.j6d9.service.CategoryService;



@Service
public class CategoryServiceImpl implements CategoryService {
@Autowired
CategoryDao cdao;
	@Override
	public List<Category> findAll() {
		
		return cdao.findAll();
	}

}
