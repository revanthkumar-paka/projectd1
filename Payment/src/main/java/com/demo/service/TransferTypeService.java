package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.entity.TransferType;
@Service
public interface TransferTypeService {
	TransferType addDetails(TransferType t);

}
