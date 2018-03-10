package com.learning.demo.web.controller;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.learning.demo.data.entity.Employee3;
import com.learning.demo.data.entity.Skillset3;
import com.learning.demo.data.entity.Sme3;
import com.learning.demo.data.repo.EmployeeRep;
import com.learning.demo.data.repo.SMERepo;
import com.learning.demo.data.repo.SkillsetRepo;
import com.learning.demo.web.vo.Employee3VO;
import com.learning.demo.web.vo.Skillset3VO;
import com.learning.demo.web.vo.Sme3VO;




@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRep employeeRepo;
	@Autowired
	private SMERepo smeRepo;
	@Autowired
	private SkillsetRepo skillsetRepo;
	
    @Autowired
    private ModelMapper modelMapper;
	
	@GetMapping(value="/save")
	public String save() {
		
		Employee3 emp = new Employee3();
		emp.setEmpId(666666);
		emp.setName("syam");
//		Skillset3 skillset1=new Skillset3(1, "JAVA");
//		Skillset3 skillset2=new Skillset3(2, "JUNIX");
		Skillset3 skillset3=new Skillset3(3, "ORACLE");		
		
		Set<Skillset3> sk = new HashSet<Skillset3>();
//		sk.add(skillset1);
//		sk.add(skillset2);
		sk.add(skillset3);
		emp.setSkillset3s(sk);
		
//		Sme3 sme1=new Sme3(1, "A");
		Sme3 sme2=new Sme3(2, "B");
		
		Set<Sme3> sm = new HashSet<Sme3>();
//		sm.add(sme1);
		sm.add(sme2);
		emp.setSme3s(sm);
		
		employeeRepo.save(emp);
		return "done";
	}
	
	@GetMapping(value="/findAllEmps")
	public Iterable<Employee3VO> findAllEmps(){
		
		return employeeRepo.findAll().stream().map(entity -> convertToVO(entity)).collect(Collectors.toList());
//		return employeeRepo.findAll();
		
	}
	@GetMapping(value="/findAllSMEs")
	public Iterable<Sme3VO> findAllSMEs(){
		
		return smeRepo.findAll().stream().map(entity -> convertToVO(entity)).collect(Collectors.toList());
//		return employeeRepo.findAll();
		
	}
	@GetMapping(value="/findAllSkillSets")
	public Iterable<Skillset3VO> findAllSkillSets(){
		
		return skillsetRepo.findAll().stream().map(entity -> convertToVO(entity)).collect(Collectors.toList());
//		return employeeRepo.findAll();
		
	}
	@GetMapping(value="/test")
	public String test(){
		
//		return employeeRepo.findAll().stream().map(entity -> convertToVO(entity)).collect(Collectors.toList());
		return "done";
		
	}
	public Employee3VO convertToVO(Employee3 employee3) {
		Employee3VO employee3VO=modelMapper.map(employee3, Employee3VO.class);
		return employee3VO;
	}
	public Skillset3VO convertToVO(Skillset3 skillset3) {
		Skillset3VO skillset3VO=modelMapper.map(skillset3, Skillset3VO.class);
		return skillset3VO;
	}
	public Sme3VO convertToVO(Sme3 sme3) {
		Sme3VO sme3VO=modelMapper.map(sme3, Sme3VO.class);
		return sme3VO;
	}
}
