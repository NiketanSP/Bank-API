package com.xoriant.bank.managerservice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.bank.managerservice.entities.Manager;
import com.xoriant.bank.managerservice.impl.ManagerServiceImpl;

@RestController
@RequestMapping("/api/manager")
public class ManagerController {
	
	@Autowired
	private ManagerServiceImpl serviceImpl;
	
	@GetMapping()
	public List<Manager> getManagers(){
		
		return serviceImpl.findAll();
	}

	 @GetMapping("/{personalInfoId}")
	 public Manager findById(@PathVariable int personalInfoId) {
		return serviceImpl.findById(personalInfoId);
	}

}
