package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Message;

@Service
public interface MessageService {
Message addDetails(Message m);
Message getById(String id);
List<Message> getAll();
}
