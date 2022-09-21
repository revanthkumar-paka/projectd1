package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Bank;

@Service
public interface BankService {
	Bank addDetails(Bank b);
	Bank getById(String id);
    List<Bank> getAll();
}
