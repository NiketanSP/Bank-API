package com.xoriant.bank.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.bank.customerservice.entities.Customer;
import com.xoriant.bank.customerservice.impl.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	

	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping()
	public List<?> getAll(){
		return customerService.findAll();
	}
	
	@PostMapping()
	public Customer addCustomer(@RequestBody Customer Customer) {
		System.out.println("Resource");
		return customerService.addCustomer(Customer);
	}
	
	@PutMapping()
	public Customer updateCustomer(@RequestBody Customer Customer) {
		return customerService.updateCustomer(Customer);
	}

	@DeleteMapping()
	public ResponseEntity<?> deleteCustomer(@RequestBody Customer Customer) {
		customerService.deleteCustomer(Customer);
		return new ResponseEntity<>("Product ID "+Customer.getPersonalInfoId()+" deleted",HttpStatus.OK);
	}
	
	@DeleteMapping ("/{accountNumber}")
	public ResponseEntity<?> deleteCustomerById(@PathVariable int accountNumber){
		customerService.deleteCustomerById(accountNumber);
		return new ResponseEntity<>("Product ID "+accountNumber+" deleted",HttpStatus.OK);
	}

}
