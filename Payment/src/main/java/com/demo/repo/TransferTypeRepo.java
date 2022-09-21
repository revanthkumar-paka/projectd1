package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.TransferType;

public interface TransferTypeRepo extends JpaRepository<TransferType,String>{

}
