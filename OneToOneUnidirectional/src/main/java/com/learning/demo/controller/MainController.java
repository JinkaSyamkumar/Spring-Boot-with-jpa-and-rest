/**
 * 
 */
package com.learning.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.entity.Credentials;
import com.learning.demo.entity.UserEntity;
import com.learning.demo.repo.CredEntityRepo;

/**
 * @author syamkumarj
 *
 */
@RestController
public class MainController {
	@Autowired
	private CredEntityRepo credRepo;
	
	@GetMapping(value="/save")
	public String save() {
		UserEntity user = new UserEntity();
		user.setId(1);
		user.setName("Syam");
		user.setInsertBy("Syam");
		user.setInsertTime(new Date());
		user.setUpdateBy("Syam");
		user.setUpdateTime(new Date());
		
		System.out.println("insert - "+user.getInsertTime());
		System.out.println("update- "+user.getUpdateTime());
		
		Credentials cred = new Credentials();
		cred.setId(1);
		cred.setUserName("JINKSY02");
		cred.setPassword("Idream01");
		cred.setUser(user);
		
		credRepo.save(cred);
		return "done";
	}
}
