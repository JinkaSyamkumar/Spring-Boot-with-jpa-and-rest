package com.gjapps.explore.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjapps.explore.data.entity.Employee;

public interface EmployeeRep extends JpaRepository<Employee, String> {

}
