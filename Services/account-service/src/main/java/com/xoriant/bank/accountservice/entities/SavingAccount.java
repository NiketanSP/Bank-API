package com.xoriant.bank.accountservice.entities;

import javax.persistence.Entity;

@Entity
public class SavingAccount extends Account{

	private double dailyLimitOfAmount;
	private int dailyLimitNoOfTransaction;
	
	public double getDailyLimitOfAmount() {
		return dailyLimitOfAmount;
	}
	public void setDailyLimitOfAmount(double dailyLimitOfAmount) {
		this.dailyLimitOfAmount = dailyLimitOfAmount;
	}
	public int getDailyLimitNoOfTransaction() {
		return dailyLimitNoOfTransaction;
	}
	public void setDailyLimitNoOfTransaction(int dailyLimitNoOfTransaction) {
		this.dailyLimitNoOfTransaction = dailyLimitNoOfTransaction;
	}
	@Override
	public String toString() {
		return "SavingAccount [dailyLimitOfAmount=" + dailyLimitOfAmount + ", dailyLimitNoOfTransaction="
				+ dailyLimitNoOfTransaction + ", getAccountNumber()=" + getAccountNumber() + ", getAccountHolderName()="
				+ getAccountHolderName() + ", getAccountType()=" + getAccountType() + ", getOpenDate()=" + getOpenDate()
				+ ", isAccountStatus()=" + isAccountStatus() + ", getBalance()=" + getBalance() + ", getCustomerId()="
				+ getCustomerId() + ", getTransaction()=" + getTransaction() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
