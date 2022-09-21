package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.TransferType;
import com.demo.service.TransferTypeService;

@RestController
@RequestMapping("/ttype")
public class TransferTypeController {
	@Autowired
	TransferTypeService tts; 
	@PostMapping("/addTransferType")
	TransferType addDetails(@RequestBody TransferType tt) {
		TransferType temp=tts.addDetails(tt);
		return temp;
	}

}
