package com.xoriant.bank.transervice.trancontroller;
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

import com.xoriant.bank.transervice.entities.Transaction;
import com.xoriant.bank.transervice.model.TransactionList;
import com.xoriant.bank.transervice.service.TransactionServiceImpl;

@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionServiceController {

	@Autowired
	private TransactionServiceImpl transactionService;
	
	@GetMapping
	public List<?> getAll(){
		return transactionService.findAll();
	}

	@GetMapping("/{transactionId}")
	public Transaction getTransactionById(@PathVariable long transactionId) {
		return transactionService.findById(transactionId);
	}
	
	@DeleteMapping("/{transactionId}")
	public void deleteById(@PathVariable long transactionId) {
		 transactionService.deleteById(transactionId);
	}
//	
//	@GetMapping("/{accountNumber}")
//	public TransactionList getTransactionByAccountNumber(@PathVariable long accountNumber){
//		return transactionService.getTransactionByAccountNumber(accountNumber);
//	}
//	
	@PostMapping()
	public Transaction addTransaction(@RequestBody Transaction transaction) {
		return this.transactionService.addTransaction(transaction);
	}
//	
	@PutMapping("/{transaction}")
	public Transaction updateTransaction(@RequestBody Transaction Transaction) {
		return transactionService.updateTransaction(Transaction);
	}

	@PutMapping("/getacc/{accountNumber}")
	public List<Transaction> getTransactionByAccountNumber(@PathVariable long accountNumber){
		return transactionService.getTransactionByAccountNumber(accountNumber);
	}

//	
}
