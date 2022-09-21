package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.currency;
import com.demo.repo.CurrencyRepo;

@Service
public class currencyServiceImpl implements currencyService{
    
	@Autowired
	CurrencyRepo cr;
	@Override
	public currency addDetails(currency c) {
		currency c1=cr.save(c);
		return c1;
	}
	
	public currency getById(String id) {
		// TODO Auto-generated method stub
		Optional<currency> c=cr.findById(id);
		currency c1=c.get();
		return c1;
		}
	
	public List<currency> getAll() {
		List<currency> c=cr.findAll();
		return c;
		
	}
	

	
}
