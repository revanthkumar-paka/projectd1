package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
	@Id
	private String messageCode;
	private String instruction;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Message(String messageCode, String instruction) {
		super();
		this.messageCode = messageCode;
		this.instruction = instruction;
	}

	public String getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

}
