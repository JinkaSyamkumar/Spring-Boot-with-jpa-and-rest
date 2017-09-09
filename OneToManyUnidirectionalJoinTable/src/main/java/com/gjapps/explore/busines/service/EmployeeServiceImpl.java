/**
 * 
 */
package com.gjapps.explore.busines.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gjapps.explore.business.vo.Result;
import com.gjapps.explore.business.vo.ResultFactory;
import com.gjapps.explore.data.entity.Employee;
import com.gjapps.explore.data.repository.EmployeeRepo;

/**
 * @author Syam
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeRepo employeeRepo;

	/* (non-Javadoc)
	 * @see com.gjapps.explore.busines.service.EmployeeService#createUser(com.gjapps.explore.data.entity.Employee)
	 */
	@Override
	public Result<Employee> createUser(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gjapps.explore.busines.service.EmployeeService#findAll()
	 */
	@Override
	public Result<List<Employee>> findAll() {
		// TODO Auto-generated method stub
		
		List<Employee> lstEmps = new ArrayList<>();
		Iterable<Employee> iterableEmps = employeeRepo.findAll();
		iterableEmps.forEach(lstEmps::add);
		
		return ResultFactory.getSuccessResult(lstEmps);
	}

}
