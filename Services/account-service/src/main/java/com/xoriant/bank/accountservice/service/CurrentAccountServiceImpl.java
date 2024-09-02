package com.xoriant.bank.accountservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.accountservice.dao.CurrentAccountServiceDao;
import com.xoriant.bank.accountservice.entities.Account;
import com.xoriant.bank.accountservice.entities.CurrentAccount;

@Service
public class CurrentAccountServiceImpl implements CurrentAccountService{

	@Autowired
	private CurrentAccountServiceDao serviceDao;

	@Override
	public List<CurrentAccount> findAll() {
		return serviceDao.findAll();
	}

	public Account addAccount(CurrentAccount acc) {
		return serviceDao.save(acc);
	}
	
}
