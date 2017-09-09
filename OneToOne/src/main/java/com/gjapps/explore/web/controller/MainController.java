/**
 * 
 */
package com.gjapps.explore.web.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gjapps.explore.data.entity.EmpAddress;
import com.gjapps.explore.data.entity.Employee;
import com.gjapps.explore.data.repo.EmpAddressRep;
import com.gjapps.explore.data.repo.EmployeeRep;
import com.gjapps.explore.web.vo.EmpAddressVO;
import com.gjapps.explore.web.vo.EmployeeVO;

/**
 * @author Syam
 *
 */
@RestController
public class MainController {
	@Autowired
	private EmployeeRep employeeRep;
	
	@Autowired
	private EmpAddressRep empAddressRep;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping(value="/save")
	public String save() {
		
		//2 ways to save 
		
		//first way- attaching to owner(who has join column)
		//bcoz of cascade it will auto save employee as well
		
		//1#cascade=CascadeType.ALL on owner is must
		Employee employee = new Employee();		
		employee.setId("srav0022");
		employee.setName("Sravani");
		
		EmpAddress obEmpAddress = new EmpAddress();		
		obEmpAddress.setAddress("Chennai");

		obEmpAddress.setEmployee(employee);
		
		empAddressRep.save(obEmpAddress);
		
		
/*		2#save employee first and attach it to the dependent one
		works when we dont have cascade on owner
		when u have cascade on owner will have below scenario
		below first we are saving employee so will have entry with the value
		second if address class cascade on employye , when we save adress, it will try to save employee
		but we get error bcoz already it is saved
		so to have second approach work, cascade should not be there in owner*/
		
/*		Employee employee = new Employee();		
		employee.setId("akulsr02");
		employee.setName("Sravs");
		employeeRep.save(employee);
		
		EmpAddress obEmpAddress = new EmpAddress();			
		obEmpAddress.setAddress("Hyd");
		obEmpAddress.setEmployee(employee);
		
		empAddressRep.save(obEmpAddress);*/
		
		return "done!";
		
	}
	
	@GetMapping(value="/findEmps")
	public List<EmployeeVO> findEmps(){
		
		return employeeRep.findAll().stream().map(employee -> convertToVo(employee)).collect(Collectors.toList());
	}
	
	protected EmployeeVO convertToVo(Employee employee) {
		EmployeeVO employeeVO = modelMapper.map(employee, EmployeeVO.class);
		return employeeVO;
	}

	@GetMapping(value="/findAddress")
	public List<EmpAddressVO> findAddress(){
		
		return empAddressRep.findAll().stream().map(empAddress -> convertToVo(empAddress)).collect(Collectors.toList());
	}
	
	protected EmpAddressVO convertToVo(EmpAddress empAddress) {
		EmpAddressVO empAddressVO = modelMapper.map(empAddress, EmpAddressVO.class);
		return empAddressVO;
	}
	@GetMapping(value="/findByAddress")
	public List<EmpAddressVO> findByAddress(){
		return empAddressRep.findByAddress("Hyd").stream().map(empAddress -> convertToVo(empAddress)).collect(Collectors.toList());
	}
	@GetMapping(value="/findByName")
	public List<EmployeeVO> findByName(){
		return employeeRep.findByName("Sravani").stream().map(employee -> convertToVo(employee)).collect(Collectors.toList());
	}
	
}
