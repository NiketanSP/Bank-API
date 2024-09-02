package com.xoriant.bank.customerservice.entities;
import com.xoriant.bank.customerservice.model.*;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Customer extends PersonalInfo{

@Transient
private List<Account> accounts;

@OneToOne
@JoinColumn(name="branchId")
private Branch branch;


public Branch getBranch() {
	return branch;
}



public void setBranch(Branch branch) {
	this.branch = branch;
}



@Override
public String toString() {
	return "Customer [accounts=" + accounts + ", branch=" + branch + ", personalInfoId=" + personalInfoId + ", user="
			+ user + ", address=" + address + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", emailId="
			+ emailId + ", mobileNumber=" + mobileNumber + "]";
}





}

