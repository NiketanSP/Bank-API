package com.xoriant.bank.accountservice.entities;

import javax.persistence.Entity;

@Entity
public class CurrentAccount extends Account {

	private double minimuBalance;
	private String companyName;
	
	public double getMinimuBalance() {
		return minimuBalance;
	}
	public void setMinimuBalance(double minimuBalance) {
		this.minimuBalance = minimuBalance;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "CurrentAccount [minimuBalance=" + minimuBalance + ", companyName=" + companyName
				+ ", getAccountNumber()=" + getAccountNumber() + ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountType()=" + getAccountType() + ", getOpenDate()=" + getOpenDate() + ", isAccountStatus()="
				+ isAccountStatus() + ", getBalance()=" + getBalance() + ", getCustomerId()=" + getCustomerId()
				+ ", getTransaction()=" + getTransaction() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
