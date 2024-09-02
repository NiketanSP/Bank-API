package com.xoriant.bank.customerservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoriant.bank.customerservice.entities.Customer;

public interface CustomerServiceDao extends JpaRepository<Customer, Integer> {
	
	//public Customer findById(int customerId);
//	public List<Customer> findCustomers();

}
