/**
 * 
 */
package com.learning.demo.controller;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.entity.AddressCompositeClass;
import com.learning.demo.entity.Bank;
import com.learning.demo.entity.ElementCollectionBasicValueTypes;
import com.learning.demo.entity.ElementCollectionCompositeTypes;
import com.learning.demo.entity.MapOfBasicValues;
import com.learning.demo.entity.CompositeTypeUserEntity;
import com.learning.demo.repo.BankRepo;
import com.learning.demo.repo.ElementCollectionBasicValueRepo;
import com.learning.demo.repo.ElementCollectionCompositeSitesRepo;
import com.learning.demo.repo.MapOfBasicValuesRepo;
import com.learning.demo.repo.UserRepo;




/**
 * @author syamkumarj
 *
 */
@RestController
public class MainController {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private BankRepo bankRepo;
	
	@Autowired
	private ElementCollectionBasicValueRepo ecRepo;
	
	@Autowired
	private MapOfBasicValuesRepo mrepo;
	
	@Autowired
	private ElementCollectionCompositeSitesRepo eccRepo;
	
	@GetMapping(value="/save")
	public String save() {
		CompositeTypeUserEntity objUserEntity = new CompositeTypeUserEntity();
		objUserEntity.setId(1);
		objUserEntity.setName("Syam");
		
		AddressCompositeClass obj = new AddressCompositeClass();
		obj.setAddressLine1("PADUR");
		obj.setAddressLine2("PACIFICA");
		obj.setCity("CHENNAI");
		
		objUserEntity.setAddress(obj);
		userRepo.save(objUserEntity);
		return "done";
	}
	
	@GetMapping(value="/saveBank")
	public String saveBank() {
		Bank objBank = new Bank();
		objBank.setId(1);
		objBank.setName("CITI_CHENNAI");
		
		AddressCompositeClass obj = new AddressCompositeClass();
		obj.setAddressLine1("PADUR");
		obj.setAddressLine2("PACIFICA");
		obj.setCity("CHENNAI");
		
		objBank.setAddressCompositeClass(obj);
		bankRepo.save(objBank);
		return "done";
	}
	
	@GetMapping(value="/saveEc")
	public String saveEc() {
		ElementCollectionBasicValueTypes ec1 = new ElementCollectionBasicValueTypes();
		ec1.setId(1);
		ec1.setName("syam");
		
		Collection<String> contacts = new ArrayList<String>();
		contacts.add("9962832656");
		contacts.add("9962262656");
		ec1.setContacts(contacts);
		
		ecRepo.save(ec1);
		return "done";
	}
	
	@GetMapping(value="/saveMap")
	public String saveMap() {

		MapOfBasicValues mbc = new MapOfBasicValues();
		mbc.setId(1);
		mbc.setName("Syam");
		mbc.getContacts().put("Home", "9962832656");
		mbc.getContacts().put("Office", "22455");
		
		mrepo.save(mbc);
		return "done";
	}
	@GetMapping(value="/saveEcc")
	public String saveEcc() {
		System.out.println("**********A collection of composite value types*********************");
		ElementCollectionCompositeTypes ec1 = new ElementCollectionCompositeTypes();
		ec1.setId(1);
		ec1.setName("syam");
		
		AddressCompositeClass acc = new AddressCompositeClass();
		acc.setAddressLine1("OMR");
		acc.setAddressLine2("PADUR");
		acc.setCity("Chennai");
		
		AddressCompositeClass acc1 = new AddressCompositeClass();
		acc1.setAddressLine1("OMR");
		acc1.setAddressLine2("KRPKM");
		acc1.setCity("CHENNAI");
		
		Set<AddressCompositeClass> lst = new HashSet<AddressCompositeClass>();
		lst.add(acc);
		lst.add(acc1);
		
		ec1.setAddresses(lst);
		
		eccRepo.save(ec1);
		return "done";
	}
}
