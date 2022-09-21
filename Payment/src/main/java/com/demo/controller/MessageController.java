package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Message;
import com.demo.service.MessageService;


@RestController
@RequestMapping(value="/Messageinfo")
public class MessageController {
	
	@Autowired
    MessageService ms;
	@PostMapping(value="/adddetalis")
	Message addCurrencyDetails(@RequestBody Message m) {
		return ms.addDetails(m);
	}
	@GetMapping(value="/getById/{id}")
	Message getById(@PathVariable String id) {
		return ms.getById(id);
	}
	@GetMapping(value="/getAll")
	List<Message> getAll(){
		return ms.getAll();
	}
}
