package com.xoriant.bank.transervice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xoriant.bank.transervice.entities.Transaction;
import com.xoriant.bank.transervice.model.TransactionList;


public interface TransactionServiceDao extends JpaRepository<Transaction, Long> {

	public List<Transaction> findByFromAccountOrToAccount(long fromAccount, long toAccount);

	
}
