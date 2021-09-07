package com.j6d9.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j6d9.entity.Category;


public interface CategoryDao extends JpaRepository<Category, String>{

}
