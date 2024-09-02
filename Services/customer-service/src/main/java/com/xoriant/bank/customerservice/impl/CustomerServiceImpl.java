package com.xoriant.bank.customerservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.customerservice.dao.CustomerServiceDao;
import com.xoriant.bank.customerservice.entities.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerServiceDao serviceDao;
	
	@Override
	public List<Customer> findAll() {
		return serviceDao.findAll();
	}

	@Override
	public void deleteCustomerById(int customerNumber) {
		serviceDao.deleteById(customerNumber);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return serviceDao.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return serviceDao.save(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		serviceDao.delete(customer);
	}

	
	
	
	
}
