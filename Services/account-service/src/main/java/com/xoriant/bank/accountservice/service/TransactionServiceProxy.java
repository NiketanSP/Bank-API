package com.xoriant.bank.accountservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xoriant.bank.accountservice.model.Transaction;

@FeignClient(name="transaction-service")
public interface TransactionServiceProxy {

	@RequestMapping("api/v1/transaction/{accountNumber}")
	public List<Transaction> getTransactions(@PathVariable(value="accountNumber")long accountNumber);
	
	@RequestMapping("api/v1/transaction")
	public void addTransaction(@RequestBody Transaction transaction);
}
