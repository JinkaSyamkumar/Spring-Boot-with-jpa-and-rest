package com.gjapps.explore.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjapps.explore.data.entity.Employee;

public interface EmployeeRep extends JpaRepository<Employee, String> {

	List<Employee> findByName(String name);
}
