package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class currency {
	@Id
	String currencycode;
	String currencyname;
	float conversionrate;
	
	public currency() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public currency(String currencycode, String currencyname, float conversionrate) {
		super();
		this.currencycode = currencycode;
		this.currencyname = currencyname;
		this.conversionrate = conversionrate;
	}

	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getCurrencyname() {
		return currencyname;
	}
	public void setCurrencyname(String currencyname) {
		this.currencyname = currencyname;
	}
	public float getConversionrate() {
		return conversionrate;
	}
	public void setConversionrate(float conversionrate) {
		this.conversionrate = conversionrate;
	}
	

}
