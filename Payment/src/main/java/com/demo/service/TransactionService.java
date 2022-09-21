package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.entity.Customer;
import com.demo.entity.Transaction;
@Service
public interface TransactionService {
	Transaction addDetails(Transaction t);
	

}
