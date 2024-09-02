package com.xoriant.bank.accountservice.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.accountservice.controller.Sender;
import com.xoriant.bank.accountservice.dao.SavingAccountServiceDao;
import com.xoriant.bank.accountservice.entities.Account;
import com.xoriant.bank.accountservice.entities.SavingAccount;
import com.xoriant.bank.accountservice.model.Transaction;
import com.xoriant.bank.accountservice.utils.TransactionType;

@Service
public class SavingAccountServiceImpl implements SavingAccountService{

	@Autowired
	private SavingAccountServiceDao savingAccountDao;
	
	@Autowired
	private TransactionServiceProxy proxy;
	
	@Autowired
	private Sender sender;
	
	
	
	public List<SavingAccount> findAll(){
		return savingAccountDao.findAll();
	}

	@Override
	public String withdrawAmount(long accountNumber, double amount) {
		
		
		SavingAccount account= savingAccountDao.getById(accountNumber);
		account.setBalance(account.getBalance() - amount);
		savingAccountDao.save(account);
		
		Transaction transaction = new Transaction();
		transaction.setFromAccount(accountNumber);
		transaction.setTransactionAmount(amount);
		transaction.setTransationDate(LocalDate.now());
		transaction.setTransactionDescription("Self Withdraw");
		transaction.setTransactionType(TransactionType.WITHDRAW);
		proxy.addTransaction(transaction);
		
		
		Map<String, Object> orderInfo=new HashMap<String, Object>();
		orderInfo.put("TRANSACTION_ID", transaction.getTransationId());
		orderInfo.put("TRANSACTION_AMOUNT", transaction.getTransactionAmount());
		orderInfo.put("TRANSACTION_DATE", transaction.getTransationDate());
		orderInfo.put("FROM_ACCOUNT", transaction.getFromAccount());
		orderInfo.put("BALANCE", account.getBalance());
		
		sender.sendEmail(orderInfo);

		return "Amount Withdraw successfully. Balance : "+account.getBalance();
	}

	@Override
	public String depositeAmount(long accountNumber, double amount) {
		
		SavingAccount account= savingAccountDao.getById(accountNumber);
		account.setBalance(account.getBalance() + amount);
		savingAccountDao.save(account);
		
		Transaction transaction = new Transaction();
		transaction.setFromAccount(accountNumber);
		transaction.setTransactionAmount(amount);
		transaction.setTransationDate(LocalDate.now());
		transaction.setTransactionDescription("Self Withdraw");
		transaction.setTransactionType(TransactionType.DEPOSIT);
		proxy.addTransaction(transaction);

		return "Amount Deposit successfully. Balance : "+account.getBalance();

	}
	
	public String transferAmount(long fromAccount, long toAccount, double amount) {
	
	SavingAccount account= savingAccountDao.getById(fromAccount);
	account.setBalance(account.getBalance() - amount);
	savingAccountDao.save(account);
	
	SavingAccount Desaccount= savingAccountDao.getById(toAccount);
	Desaccount.setBalance(Desaccount.getBalance() + amount);
	savingAccountDao.save(Desaccount);
	
	Transaction transaction = new Transaction();
	transaction.setFromAccount(fromAccount);
	transaction.setToAccount(toAccount);
	transaction.setTransactionAmount(amount);
	transaction.setTransationDate(LocalDate.now());
	transaction.setTransactionDescription("Money Transfer");
	transaction.setTransactionType(TransactionType.TRANSFER);
	proxy.addTransaction(transaction);
	
	return "Amount Transfer successfully. Balance : "+account.getBalance();
	}

	@Override
	public Account addAccount(SavingAccount savingAccount) {
		// TODO Auto-generated method stub
		return savingAccountDao.save(savingAccount);
	}

	@Override
	public Account updateAccount(SavingAccount savingAccount) {
		// TODO Auto-generated method stub
		
		return savingAccountDao.save(savingAccount);
	}

	@Override
	public void deleteAccountById(long accountNumber) {
		// TODO Auto-generated method stub
		savingAccountDao.deleteById(accountNumber);
	}

	@Override
	public void deleteAccount(SavingAccount savingAccount) {
		savingAccountDao.delete(savingAccount);		
	}

	@Override
	public String fundtransfer(long fromAccount, long toAccount, double amount) {
		SavingAccount account= savingAccountDao.getById(fromAccount);
		account.setBalance(account.getBalance() - amount);
		savingAccountDao.save(account);
		
		SavingAccount Desaccount= savingAccountDao.getById(toAccount);
		Desaccount.setBalance(Desaccount.getBalance() + amount);
		savingAccountDao.save(Desaccount);
		
		Transaction transaction = new Transaction();
		transaction.setFromAccount(fromAccount);
		transaction.setToAccount(toAccount);
		transaction.setTransactionAmount(amount);
		transaction.setTransationDate(LocalDate.now());
		transaction.setTransactionDescription("Money Transfer");
		transaction.setTransactionType(TransactionType.TRANSFER);
		proxy.addTransaction(transaction);
		
		return "Amount Transfer successfully. Balance : "+account.getBalance();
	}

	}	

