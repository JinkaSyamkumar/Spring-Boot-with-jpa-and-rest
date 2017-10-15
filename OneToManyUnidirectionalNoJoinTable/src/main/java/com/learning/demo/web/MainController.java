package com.learning.demo.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.entity.Account;
import com.learning.demo.entity.Transact;
import com.learning.demo.repo.AccountRepo;

@RestController
public class MainController {

	@Autowired
	private AccountRepo accRpo;
	
	@GetMapping(value="/save")
	public String save() {
		Account acc= new Account();
		acc.setAccountno(12345L);
		acc.setHoldername("Syam");
		acc.setHolderbank("CITI");
		
		Transact tr = new Transact();
		tr.setId(23243L);
		tr.setInsertTime(new Date());
		
		Transact tr1 = new Transact();
		tr1.setId(23245L);
		tr1.setInsertTime(new Date());
		
		acc.getTransactions().add(tr);
		acc.getTransactions().add(tr1);
		
		accRpo.save(acc);
		
		return "done";
	}
	
}
