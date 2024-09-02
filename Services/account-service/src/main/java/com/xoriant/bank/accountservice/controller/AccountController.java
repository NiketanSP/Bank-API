package com.xoriant.bank.accountservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.bank.accountservice.entities.Account;
import com.xoriant.bank.accountservice.entities.CurrentAccount;
import com.xoriant.bank.accountservice.service.CurrentAccountServiceImpl;


@RestController
@RequestMapping("/api/account")
public class AccountController {
	
	@Autowired
	private CurrentAccountServiceImpl currServiceImpl;
	
	@GetMapping
	public List<CurrentAccount> findAllcur(){
		return currServiceImpl.findAll();
	}
	
	@PostMapping
	public Account addAccount(@RequestBody CurrentAccount acc) {
		System.out.println("saved");
		return currServiceImpl.addAccount(acc);
	}
		
	
}
