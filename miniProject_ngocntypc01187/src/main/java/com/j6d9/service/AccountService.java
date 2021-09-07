package com.j6d9.service;

import java.util.List;

import com.j6d9.entity.Account;



public interface AccountService {
	public Account findById(String username);
	public List<Account> getAdministrators();
	public List<Account> findAll();
}	
