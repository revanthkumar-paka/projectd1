package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Bank;
import com.demo.service.BankService;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/bankinfo")
public class BankController {
    
	@Autowired
	BankService bs;
	@PostMapping(value="/addbankdetails")
	Bank addDetails(@RequestBody Bank b1) {
		return bs.addDetails(b1);
	}
	@GetMapping(value="/byid/{id}")
	Bank getById(@PathVariable String id) {
		System.out.println(id);
		return bs.getById(id);
	}
	@GetMapping(value="/getall")
	List<Bank> getAll(){
		return bs.getAll();
	}
}
