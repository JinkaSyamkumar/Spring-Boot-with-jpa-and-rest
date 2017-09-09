/**
 * 
 */
package com.gjapps.explore.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gjapps.explore.data.entity.Employee;

/**
 * @author Syam
 *
 */
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
	List<Employee> findByName(String name);
}
