package com.xoriant.bank.accountservice.service;

import java.util.List;

import com.xoriant.bank.accountservice.entities.Account;
import com.xoriant.bank.accountservice.entities.CurrentAccount;

public interface CurrentAccountService {

	public List<CurrentAccount> findAll();
	public Account addAccount(CurrentAccount acc);

}
