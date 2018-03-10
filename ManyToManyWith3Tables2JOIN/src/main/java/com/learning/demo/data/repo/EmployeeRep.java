package com.learning.demo.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.demo.data.entity.Employee3;

public interface EmployeeRep extends JpaRepository<Employee3, Long> {

}
