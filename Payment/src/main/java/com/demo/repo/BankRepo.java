package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Bank;

public interface BankRepo extends JpaRepository<Bank,String>{

}
