package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.currency;

@Service
public interface currencyService {
	currency addDetails(currency c);
	currency getById(String id);
	List<currency> getAll();

}
