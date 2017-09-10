package com.gjapps.explore.web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.gjapps.explore.data.entity.Employee;
import com.gjapps.explore.data.entity.SkillSet;
import com.gjapps.explore.data.repo.EmployeeRepo;
import com.gjapps.explore.data.repo.SkillSetRepo;
import com.gjapps.explore.data.vo.EmployeeVO;
import com.gjapps.explore.data.vo.SkillSetVO;

@RestController
public class MainController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private SkillSetRepo skillSetRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping(value="/save")
	public String save() {
		
/*		//#1 saving through employee object
 * 		Employee objEmp = new Employee("JINKSY09","kumar");
		
		SkillSet skillset1=new SkillSet(7, "JAVA");
		SkillSet skillset2=new SkillSet(8, "UNIX");
		SkillSet skillset3=new SkillSet(9, "Oracle");		
		
		Set<SkillSet> sk = new HashSet<SkillSet>();
		sk.add(skillset1);
		sk.add(skillset2);
		sk.add(skillset3);
		
		objEmp.setSkillSet(sk);
		employeeRepo.save(objEmp);*/
		
		
		//#2 saving through skill set object
		Employee objEmp1 = new Employee("JINKSY12","guru");
		Employee objEmp2 = new Employee("JINKSY13","guru1");
		Set<Employee> emp = new HashSet<Employee>();
		emp.add(objEmp1);
		emp.add(objEmp2);
		
		SkillSet skillset5=new SkillSet(11, "eclipse");
		skillset5.setEmployee(emp);
		skillSetRepo.save(skillset5);
		
/*		when u trigger above it only updates parent n child not join table
		only owner can update the join table
		When you have a bidirectional association, one side is the owner side (the side without the mappedBy attribute), and the other is the inverse side (the one with the mappedBy attribute).

		Hibernate only considers the owner side to know if there is an association between two entities. So, if A is the owner side in the relation between A and B, you must add B instances to A's collection to make an association persistent. Adding A instances to B's collection has no effect.

		In general, you are responsible for maintaining the coherence of the object graph, and thus you should make sure that the owner side (at least) is always updated.*/
		
		
		return "done";
	}
	@GetMapping(value="findSkills")
	public List<SkillSetVO> findSkills(){
		
		return skillSetRepo.findAll().stream().map(skillset -> convertToVo(skillset)).collect(Collectors.toList());
	}
	
	protected SkillSetVO convertToVo(SkillSet skillSet) {
		SkillSetVO skillSetVO=modelMapper.map(skillSet, SkillSetVO.class);
		return skillSetVO;
	}
	
	@GetMapping(value="findEmps")
	public List<EmployeeVO> findEmps(){
		
		return employeeRepo.findAll().stream().map(employee -> convertToVo(employee)).collect(Collectors.toList());
	}
	protected EmployeeVO convertToVo(Employee employee) {
		EmployeeVO employeeVO=modelMapper.map(employee, EmployeeVO.class);
		return employeeVO;
	}
}
