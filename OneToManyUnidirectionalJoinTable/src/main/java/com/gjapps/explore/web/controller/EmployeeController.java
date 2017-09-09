/**
 * 
 */
package com.gjapps.explore.web.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gjapps.explore.busines.service.EmployeeServiceImpl;
import com.gjapps.explore.business.vo.Result;
import com.gjapps.explore.data.entity.Employee;
import com.gjapps.explore.data.entity.SkillSet;
import com.gjapps.explore.data.repository.EmployeeRepo;
import com.gjapps.explore.data.repository.SkillSetRepo;

/**
 * @author Syam
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private SkillSetRepo skillSetRepo;
	
	@Autowired
	private EmployeeServiceImpl employeeService;

	@RequestMapping(value="/save")
	public String process(@RequestBody Employee emp) {

		employeeRepo.save(emp);

		return "Done";
	}

	@RequestMapping(value="/oneToMany")
	public String oneToMany() {
		Employee objEmp = new Employee("JINKSY04","Syam");
		
		SkillSet skillset1=new SkillSet(4, "JAVA");
		SkillSet skillset2=new SkillSet(5, "UNIX");
		SkillSet skillset3=new SkillSet(6, "Oracle");
		
		skillSetRepo.saveAndFlush(skillset1);
		skillSetRepo.saveAndFlush(skillset2);
		skillSetRepo.saveAndFlush(skillset3);
		
		List<SkillSet> sk = new ArrayList<SkillSet>();
		sk.add(skillset1);
		sk.add(skillset2);
		sk.add(skillset3);
		
		objEmp.setSkillSets(sk);
		employeeRepo.save(objEmp);

		return "Done";
	}
	@GetMapping(value="/findAll", produces=MediaType.APPLICATION_JSON_VALUE)
	public Result<List<Employee>> findAll() {
//		List<Employee> lstEmps = new ArrayList<>();
//		Iterable<Employee> iterableEmps = employeeRepo.findAll();
//		iterableEmps.forEach(lstEmps::add);
		
		Result<List<Employee>> lst=employeeService.findAll();
		return lst;
	}
	
	@GetMapping(value="/customer",  produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Employee> getAll() {
		List<Employee> list = new ArrayList<>();
		Iterable<Employee> customers = employeeRepo.findAll();
 
		customers.forEach(list::add);
		return customers;
	}
	

}
