/**
 * 
 */
package com.learning.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.entity.Department;
import com.learning.demo.entity.StudentEntity;
import com.learning.demo.repo.StudentRepo;

/**
 * @author syamkumarj
 *
 */
@RestController
public class MainController {
	@Autowired
	private StudentRepo studentRepo;
	
	@GetMapping(value="/save")
	public String save() {
		
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(1);
		studentEntity.setName("syam");
		Department dept = new Department();
		dept.setId(1);
		dept.setDeptName("ECE");
		studentEntity.setDepartment(dept);
		studentRepo.save(studentEntity);
		return "done";
	}
}
