package com.xoriant.bank.accountservice.model;

import java.time.LocalDate;

import com.xoriant.bank.accountservice.utils.TransactionType;

public class Transaction {

	
	private long transationId;
	private LocalDate transationDate;
	private TransactionType transactionType;
	private double transactionAmount;
	private String transactionDescription;
	private long fromAccount;
	private long toAccount;
	
	public long getTransationId() {
		return transationId;
	}
	public void setTransationId(long transationId) {
		this.transationId = transationId;
	}
	public LocalDate getTransationDate() {
		return transationDate;
	}
	public void setTransationDate(LocalDate transationDate) {
		this.transationDate = transationDate;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionDescription() {
		return transactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}
	public long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public long getToAccount() {
		return toAccount;
	}
	public void setToAccount(long toAccount) {
		this.toAccount = toAccount;
	}
	

}
