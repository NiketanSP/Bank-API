package com.xoriant.bank.customerservice.impl;

import java.util.List;

import com.xoriant.bank.customerservice.entities.Customer;

public interface CustomerService {

	List<Customer> findAll();

	Customer addCustomer(Customer account);

	Customer updateCustomer(Customer account);

	void deleteCustomer(Customer account);

	void deleteCustomerById(int accountNumber);
}