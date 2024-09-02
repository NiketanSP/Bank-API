package com.xoriant.bank.managerservice.entities;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Manager extends PersonalInfo{


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
	return "Manager [branch=" + branch + ", personalInfoId=" + personalInfoId + ", user=" + user + ", address="
			+ address + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", emailId=" + emailId
			+ ", mobileNumber=" + mobileNumber + "]";
}

}

