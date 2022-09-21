package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long> {

}
