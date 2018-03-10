package com.learning.demo.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.demo.entity.Department;
import com.learning.demo.entity.Student;
import com.learning.demo.repo.StudentRepo;

@RestController
public class MainController {

	@Autowired
	private StudentRepo sRpo;
	
	@GetMapping(value="/save")
	public String save() {
		Department department = new Department();
		department.setId(1);
		department.setName("ECE");
		
		Department department1 = new Department();
		department1.setId(2);
		department1.setName("CSE");
		
		Student student = new Student();
		student.setId(88);
		student.setStudentName("kumar");
		student.setDepartment(department);
		
		Student student1 = new Student();
		student1.setId(99);
		student1.setStudentName("jinka");
		student1.setDepartment(department1);
		sRpo.save(student);
		sRpo.save(student1);
		return "done";
	}
	
}
