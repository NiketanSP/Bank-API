package com.xoriant.bank.managerservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.xoriant.bank.managerservice.utils.Role;

@Entity
public class User {

	@Id
	private int userId;
	public String userName;
	private String password;
	private Role role;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}

	
}
