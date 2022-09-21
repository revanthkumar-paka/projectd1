package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Customer;
import com.demo.service.CustomerService;
@RestController
@RequestMapping("/custinfo")
public class CustomerController {
	@Autowired
	CustomerService ser;
	@PostMapping("/addCustomer")
    public Customer add(@RequestBody Customer customer)
    {
        //System.out.println(customer.getAccountHolderName());
        return ser.addCustomer(customer);
    }
    @GetMapping("/getCustomer/{id}")
    public Customer ret(@PathVariable Long id) {
        return ser.getDetails(id);
    }

}
