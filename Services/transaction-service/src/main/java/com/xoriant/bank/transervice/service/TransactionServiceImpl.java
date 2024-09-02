package com.xoriant.bank.transervice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.transervice.dao.TransactionServiceDao;
import com.xoriant.bank.transervice.entities.Transaction;
import com.xoriant.bank.transervice.model.TransactionList;


@Service
public class TransactionServiceImpl {
	@Autowired
	public TransactionServiceDao serviceDao;
	
	public List<Transaction> findAll() {
		return serviceDao.findAll();
	}
	
	public Transaction findById(long transactionId) {
		return serviceDao.findById(transactionId).get();
	}
	
	public void deleteById(long transactionId) {
	serviceDao.deleteById(transactionId);
	}

	public Transaction addTransaction(Transaction transaction) {
		return serviceDao.save(transaction);
	}

	public Transaction updateTransaction(Transaction transaction) {
		return serviceDao.save(transaction);
	}
//
//	public void deleteTransaction(Transaction transaction) {
//		serviceDao.delete(transaction);
//	}
//
//	public void deleteTransactionById(long transactionId) {
//		serviceDao.deleteById(transactionId);
//	}

	public List<Transaction> getTransactionByAccountNumber(long accountNumber) {
		// TODO Auto-generated method stub
		
		return getTransactionByAccountNumber(accountNumber);
	}

//	public TransactionList getTransactionByAccountNumber(long accountNumber) {
//		TransactionList list = new TransactionList();
//		list.setTransactions(serviceDao.findByFromAccountOrToAccount(accountNumber, accountNumber));
//		return list;
//	}

}
