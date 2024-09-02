package com.xoriant.bank.customerservice.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.xoriant.bank.customerservice.utils.Gender;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonalInfo {

//	User user;
	@Id
	@GeneratedValue
	protected int personalInfoId;
	
	@OneToOne
	@JoinColumn(name="userId")
	protected User user;
	
	@OneToOne
	@JoinColumn(name="addressId")
	protected Address address;
	
	protected String name;
	protected LocalDate dob;
	protected Gender gender;
	protected String emailId;
	protected long mobileNumber;
	
	
	public int getPersonalInfoId() {
		return personalInfoId;
	}
	public void setPersonalInfoId(int personalInfoId) {
		this.personalInfoId = personalInfoId;
	}
	protected String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "PersonalInfo [personalInfoId=" + personalInfoId + ", user=" + user + ", address=" + address + ", name="
				+ name + ", dob=" + dob + ", gender=" + gender + ", emailId=" + emailId + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
}
