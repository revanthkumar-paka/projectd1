package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.entity.Customer;

@Service
public interface CustomerService {
	Customer getDetails(Long id);
	Customer addCustomer(Customer c);

}
