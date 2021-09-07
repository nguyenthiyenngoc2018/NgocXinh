package com.j6d9.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j6d9.dao.RoleDao;
import com.j6d9.entity.Role;
import com.j6d9.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
   @Autowired
   RoleDao dao;
   
   public List<Role> findAll(){
	   return dao.findAll();
   }
}
