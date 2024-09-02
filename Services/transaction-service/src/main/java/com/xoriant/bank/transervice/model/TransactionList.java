package com.xoriant.bank.transervice.model;

import java.util.List;

import com.xoriant.bank.transervice.entities.Transaction;

public class TransactionList {

	private List<Transaction> transactions;

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
