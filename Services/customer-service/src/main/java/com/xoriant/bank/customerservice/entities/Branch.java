package com.xoriant.bank.customerservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {

	@Id
	private int branchId;
	private String branchName;
	private String Aaddress;
	private String ifscCode;
	private long micr;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAaddress() {
		return Aaddress;
	}
	public void setAaddress(String aaddress) {
		Aaddress = aaddress;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public long getMicr() {
		return micr;
	}
	public void setMicr(long micr) {
		this.micr = micr;
	}
	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", Aaddress=" + Aaddress + ", ifscCode="
				+ ifscCode + ", micr=" + micr + "]";
	}

	
	
}
