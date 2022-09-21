package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Message;
import com.demo.repo.MessageRepo;
@Service
public class MessageServiceImpl implements MessageService {
   
	@Autowired
	MessageRepo mr;
	@Override
	public Message addDetails(Message m) {
		Message temp=mr.save(m);
		return temp;
	}
	@Override
	public Message getById(String id) {
		// TODO Auto-generated method stub
        Optional<Message> m=mr.findById(id);
        Message m1=m.get();
        return m1;
   }
	@Override
	public List<Message> getAll() {
		// TODO Auto-generated method stub
		List<Message> lst=mr.findAll();
		return lst;
	}

}
