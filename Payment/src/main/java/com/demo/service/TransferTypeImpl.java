package com.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.TransferType;
import com.demo.repo.TransferTypeRepo;

@Service
public class TransferTypeImpl implements TransferTypeService{

	@Autowired
	TransferTypeRepo ttr;
	@Override
	public TransferType addDetails(TransferType t) {
		TransferType t1=ttr.save(t);
		return t1;
	}

}
