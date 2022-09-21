package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Message;

public interface MessageRepo extends JpaRepository<Message,String> {

}
