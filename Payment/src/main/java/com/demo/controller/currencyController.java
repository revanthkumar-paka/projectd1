package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.currency;
import com.demo.service.currencyService;

@RestController
@RequestMapping(value="/currencyinfo")
public class currencyController {
	
	@Autowired
	currencyService cs;
	@PostMapping(value="/adddetalis")
	currency addCurrencyDetails(@RequestBody currency c) {
		return cs.addDetails(c);
	}
	
    @GetMapping(value="/getById/{id}")
    currency getByid(@PathVariable String id) {
    	return cs.getById(id);
    }
    @GetMapping(value="/getAll")
    List<currency> getAll(){
    	return cs.getAll();
    }
}
