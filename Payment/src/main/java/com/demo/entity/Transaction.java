package com.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

	@Id
	private int transactionid;
	@ManyToOne
    @JoinColumn(name = "senderId")
	Customer c;
	@ManyToOne
	@JoinColumn(name="currencyType")
	currency ct;
	@ManyToOne
	@JoinColumn(name="senderBank")
	Bank sb;
	@ManyToOne
	@JoinColumn(name="reciverBank")
	Bank rb;
	@ManyToOne
	@JoinColumn(name="message")
	Message m;
	@ManyToOne
	@JoinColumn(name="senderTransfertype")
	TransferType tt;
	private String customerid;
	private String currencycode;
	private String senderBIC;
	private String reciverBIc;
	private long receiveraccountholdernumber;
	private String receiveraccountholdername;
	private String transfertypecode;
	private String messagecode;
	private double currencyamount;
	private double transferfees;
	private double inramount;
	private Date transferdate;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int transactionid, Customer c, currency ct, Bank sb, Bank rb, Message m, TransferType tt,
			String customerid, String currencycode, String senderBIC, String reciverBIc,
			long receiveraccountholdernumber, String receiveraccountholdername, String transfertypecode,
			String messagecode, double currencyamount, double transferfees, double inramount, Date transferdate) {
		super();
		this.transactionid = transactionid;
		this.c = c;
		this.ct = ct;
		this.sb = sb;
		this.rb = rb;
		this.m = m;
		this.tt = tt;
		this.customerid = customerid;
		this.currencycode = currencycode;
		this.senderBIC = senderBIC;
		this.reciverBIc = reciverBIc;
		this.receiveraccountholdernumber = receiveraccountholdernumber;
		this.receiveraccountholdername = receiveraccountholdername;
		this.transfertypecode = transfertypecode;
		this.messagecode = messagecode;
		this.currencyamount = currencyamount;
		this.transferfees = transferfees;
		this.inramount = inramount;
		this.transferdate = transferdate;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	public currency getCt() {
		return ct;
	}
	public void setCt(currency ct) {
		this.ct = ct;
	}
	public Bank getSb() {
		return sb;
	}
	public void setSb(Bank sb) {
		this.sb = sb;
	}
	public Bank getRb() {
		return rb;
	}
	public void setRb(Bank rb) {
		this.rb = rb;
	}
	public Message getM() {
		return m;
	}
	public void setM(Message m) {
		this.m = m;
	}
	public TransferType getTt() {
		return tt;
	}
	public void setTt(TransferType tt) {
		this.tt = tt;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getSenderBIC() {
		return senderBIC;
	}
	public void setSenderBIC(String senderBIC) {
		this.senderBIC = senderBIC;
	}
	public String getReciverBIc() {
		return reciverBIc;
	}
	public void setReciverBIc(String reciverBIc) {
		this.reciverBIc = reciverBIc;
	}
	public long getReceiveraccountholdernumber() {
		return receiveraccountholdernumber;
	}
	public void setReceiveraccountholdernumber(long receiveraccountholdernumber) {
		this.receiveraccountholdernumber = receiveraccountholdernumber;
	}
	public String getReceiveraccountholdername() {
		return receiveraccountholdername;
	}
	public void setReceiveraccountholdername(String receiveraccountholdername) {
		this.receiveraccountholdername = receiveraccountholdername;
	}
	public String getTransfertypecode() {
		return transfertypecode;
	}
	public void setTransfertypecode(String transfertypecode) {
		this.transfertypecode = transfertypecode;
	}
	public String getMessagecode() {
		return messagecode;
	}
	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}
	public double getCurrencyamount() {
		return currencyamount;
	}
	public void setCurrencyamount(double currencyamount) {
		this.currencyamount = currencyamount;
	}
	public double getTransferfees() {
		return transferfees;
	}
	public void setTransferfees(double transferfees) {
		this.transferfees = transferfees;
	}
	public double getInramount() {
		return inramount;
	}
	public void setInramount(double inramount) {
		this.inramount = inramount;
	}
	public Date getTransferdate() {
		return transferdate;
	}
	public void setTransferdate(Date transferdate) {
		this.transferdate = transferdate;
	}
     
}
