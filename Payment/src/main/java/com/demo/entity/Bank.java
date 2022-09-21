package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
    
	@Id
	private String bic;
	private String bankName;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bank(String bic, String bankName) {
		super();
		this.bic = bic;
		this.bankName = bankName;
	}

	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
}
