package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
    
    
	@ManyToOne
	@JoinColumn(name = "BankDetails")
	Bank b1;
	
	
    public Bank getB1() {
		return b1;
	}
	public void setB1(Bank b1) {
		this.b1 = b1;
	}
	@Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    
     private Long cid;
    @Column(name="cname")
    private String cname;
      @Column(name="od")
    private int od;
      @Column(name="balance")
    private double balance;
    public Long getCid() {
        return cid;
    }
    public void setCid(Long cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public int getOd() {
        return od;
    }
    public void setOd(int od) {
        this.od = od;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
   
     public Customer() {
            super();
        }
     public Customer(Long cid, String cname, int od, double balance) {
            
            this.cid = cid;
            this.cname = cname;
            this.od = od;
            this.balance = balance;
        }
    
     
}
