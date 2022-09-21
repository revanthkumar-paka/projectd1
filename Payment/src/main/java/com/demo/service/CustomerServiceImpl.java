package com.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Customer;
import com.demo.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	    @Autowired
	    CustomerRepo repo;
	   public Customer getDetails(Long id)
	   {
	       Optional<Customer> c=repo.findById(id);
	       Customer c1=c.get();
	       return c1;
	   }
	public Customer addCustomer(Customer customer) {
	    // TODO Auto-generated method stub
	    //System.out.println(customer.getAccountHolderName());
	    Customer cus=repo.save(customer);
	    
	    return cus;
	}


}
