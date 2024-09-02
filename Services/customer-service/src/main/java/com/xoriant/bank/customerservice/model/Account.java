package com.xoriant.bank.customerservice.model;

import java.time.LocalDate;

public class Account {

	protected long accountNumber;
	protected String aAccountHolderName;
	protected LocalDate openDate;
	protected boolean accountStatus;
	protected double balance;
	protected long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getaAccountHolderName() {
		return aAccountHolderName;
	}
	public void setaAccountHolderName(String aAccountHolderName) {
		this.aAccountHolderName = aAccountHolderName;
	}
	public LocalDate getOpenDate() {
		return openDate;
	}
	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}
	public boolean isAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
