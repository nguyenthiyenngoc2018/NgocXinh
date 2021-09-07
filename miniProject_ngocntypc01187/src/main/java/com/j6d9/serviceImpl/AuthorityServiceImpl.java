package com.j6d9.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j6d9.dao.AccountDao;
import com.j6d9.dao.AuthorityDao;
import com.j6d9.entity.Account;
import com.j6d9.entity.Authority;
import com.j6d9.service.AuthorityService;



@Service
public class AuthorityServiceImpl implements AuthorityService {
	@Autowired
	AuthorityDao dao;
	@Autowired
	AccountDao acdao;

	
	public List<Authority> findAll() {
		return dao.findAll();
	}

	
	public Authority create(Authority auth) {
		return dao.save(auth);
	}

	
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}

}
