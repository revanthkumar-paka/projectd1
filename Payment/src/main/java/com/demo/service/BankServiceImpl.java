package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Bank;
import com.demo.repo.BankRepo;

@Service
public class BankServiceImpl implements BankService{
    @Autowired
	BankRepo repo;
	@Override
	public Bank addDetails(Bank b) {
		
		Bank b1=repo.save(b);
		return b1;
		
	}
	@Override
	public Bank getById(String id) {
		Optional<Bank> bb=repo.findById(id);
		Bank b1=bb.get();
		return b1;
	}
	@Override
	public List<Bank> getAll() {
		List<Bank> lst=repo.findAll();
		return lst;
	}

}
