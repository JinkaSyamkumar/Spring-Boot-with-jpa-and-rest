package com.gjapps.explore.busines.service;

import java.util.List;

import com.gjapps.explore.business.vo.Result;
import com.gjapps.explore.data.entity.Employee;

/**
 * @author Syam
 *
 */
public interface EmployeeService {
	
	Result<Employee> createUser(Employee employee);
	
	Result<List<Employee>> findAll();

}
