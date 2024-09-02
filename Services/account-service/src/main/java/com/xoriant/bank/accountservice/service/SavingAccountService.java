package com.xoriant.bank.accountservice.service;

import java.util.List;

import com.xoriant.bank.accountservice.entities.Account;
import com.xoriant.bank.accountservice.entities.SavingAccount;

public interface SavingAccountService{


	List<SavingAccount> findAll();
	
	String withdrawAmount(long accountNumber, double amount);

	String depositeAmount(long accountNumber, double amount);

	Account addAccount(SavingAccount savingAccount);

	Account updateAccount(SavingAccount savingAccount);

	void deleteAccountById(long accountNumber);

	void deleteAccount(SavingAccount savingAccount);

	 String fundtransfer(long fromAccount, long toAccount, double amount);
	
	
}
