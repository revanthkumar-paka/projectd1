package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Transaction;
import com.demo.service.TransactionService;

@RestController
@RequestMapping(value="/transactioninfo")
public class TransactionController {
	@Autowired
	TransactionService ts;
@PostMapping(value="/addDetails")
Transaction addDetails(Transaction t) {
	return ts.addDetails(t);
}
}
