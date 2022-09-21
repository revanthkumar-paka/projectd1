package com.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Customer;
import com.demo.entity.Transaction;
import com.demo.repo.CustomerRepo;
import com.demo.repo.SdnRepo;
import com.demo.repo.TransactionRepo;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepo tr;
	CustomerRepo cr;
	SdnRepo sdr;
	
	@Override
	public Transaction addDetails(Transaction t) {
		Optional<Customer> opt=cr.findById(t.getReceiveraccountholdernumber());
		Customer c=opt.get();
		long sender=t.getC().getCid();
		
		Optional<Customer> opt1=cr.findById(sender);
		Customer c1=opt1.get();
        if(sdr.findById(c.getCname())!=null) {
        	
        }
        if(t.getTransfertypecode().equals("Bank")) {
    		if(!c1.getB1().getBankName().equals("HDFC")|!c.getB1().getBankName().equals("HDFC")) {
    			
    		}
    		
    	}
        double a=t.getCurrencyamount();
        double fee=a*0.5;
        double total=a+fee;
        double senderamt=c1.getBalance();
        c1.setBalance(senderamt-total);
        double reciveramt=c.getBalance();
        c.setBalance(reciveramt+a);
	return null;
	}

}
