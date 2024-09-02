package com.xoriant.bank.accountservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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

import com.netflix.discovery.converters.Auto;
import com.xoriant.bank.accountservice.entities.Account;
import com.xoriant.bank.accountservice.entities.SavingAccount;
import com.xoriant.bank.accountservice.service.SavingAccountService;
import com.xoriant.bank.accountservice.service.SavingAccountServiceImpl;

@RestController
@RefreshScope
@RequestMapping("/api/v1/account/saving")
public class SavingAccountResource {
	
	@Autowired
	private SavingAccountService savingService;
	
	@PutMapping("/{accountNumber}/withdrawl/{amount}")
	public String withdrawAmount(@PathVariable long accountNumber,@PathVariable double amount) {
		return savingService.withdrawAmount(accountNumber,amount);
	}
	
	@PutMapping("/{accountNumber}/deposit/{amount}")
	public String depositeAmount(@PathVariable long accountNumber,@PathVariable double amount) {
		return savingService.depositeAmount(accountNumber,amount);
	}

	@GetMapping
	public List<?> getAll(){
		return savingService.findAll();
	}
	
	@PostMapping()
	public Account addSavingAccount(@RequestBody SavingAccount savingAccount) {
		System.out.println("Resource");
		return savingService.addAccount(savingAccount);
	}
	
	@PutMapping()
	public Account updateSavingAccount(@RequestBody SavingAccount savingAccount) {
		return savingService.updateAccount(savingAccount);
	}

	
	@DeleteMapping()
	public ResponseEntity<?> deleteSavingAccount(@RequestBody SavingAccount savingAccount) {
		savingService.deleteAccount(savingAccount);
		return new ResponseEntity<>("Product ID "+savingAccount.getAccountNumber()+" deleted",HttpStatus.OK);
	}
	
	@DeleteMapping ("/{accountNumber}")
	public ResponseEntity<?> deleteAccountById(@PathVariable long accountNumber){
		savingService.deleteAccountById(accountNumber);
		return new ResponseEntity<>("Product ID "+accountNumber+" deleted",HttpStatus.OK);
	}
	
	
	@PutMapping("/{fromAccount}/{toAccount}/{amount}")
	public String fundtransfer(@PathVariable long fromAccount,@PathVariable long toAccount,@PathVariable double amount) {
		return savingService.fundtransfer(fromAccount,toAccount,amount);
	}

	
}
