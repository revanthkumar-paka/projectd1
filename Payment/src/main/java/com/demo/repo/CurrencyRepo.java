package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.currency;

@Repository
public interface CurrencyRepo extends JpaRepository<currency,String> {

}
