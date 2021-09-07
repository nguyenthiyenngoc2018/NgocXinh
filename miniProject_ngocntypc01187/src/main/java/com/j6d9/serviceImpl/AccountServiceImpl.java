package com.j6d9.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j6d9.dao.AccountDao;
import com.j6d9.entity.Account;
import com.j6d9.service.AccountService;



@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDao adao;

	@Override
	public Account findById(String username) {
		return adao.findById(username).get();
	}

	
	public List<Account> getAdministrators() {
		return adao.getAdministrators();
	}

	
	public List<Account> findAll() {
		return adao.findAll();
	}
	
	

}
