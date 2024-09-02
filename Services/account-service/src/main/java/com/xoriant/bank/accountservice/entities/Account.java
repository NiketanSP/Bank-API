package com.xoriant.bank.accountservice.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Transient;

import com.xoriant.bank.accountservice.model.Transaction;
import com.xoriant.bank.accountservice.utils.AccountType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Account {

	@Id
	@GeneratedValue
	protected long accountNumber;
	
	protected String accountHolderName;
	protected AccountType accountType;
	protected LocalDate openDate;
	protected boolean accountStatus;
	protected double balance;
	protected int customerId;
	
	@Transient
	protected List<Transaction> transaction;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", openDate=" + openDate + ", accountStatus=" + accountStatus + ", balance=" + balance
				+ ", customerId=" + customerId + ", transaction=" + transaction + "]";
	}
	
	
	
}
