package com.learning.demo.repo;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.learning.demo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	//Transversing Nested properties
	
	//in relation mapping we will have nexted properties ex
	//ex employee has skillsets , and skillset has its own fields
	//skillset by id- ie transversiong relation
	//check in employeerepo.java
	//findBySkillSetsTechName
	//first it will check for SkillSetsTechName
	//but there is no such property so it will split with diff combinations
	//SkillSets TechName and finally it tranverses and maps
	
	public List<Employee> findBySkillSetsTechName(String techName);
	
	//above might be confusing - to make it more clear
	//we can use _ to indicate nested property
	public List<Employee> findBySkillSets_Id(int techId);
	
	//Query annotation
 	@Query("select e from Employee e")
 	public List<Employee> queryOne();
 	
 	//supplied argument - ?1
 	@Query("select e from Employee e where e.id=?1")
 	public List<Employee> queryTwo(String id);
 	
 	//avoid positional parameter instead use named parameter
 	@Query("select e from Employee e where e.id=:id")
 	public List<Employee> queryThree(@Param("id") String id);
 	
 	//Named Queries - dont mind the errors.methods work issue bcoz of sts
 	public List<Employee> queryFour();
 	public List<Employee> queryFive(String id);
 	public List<Employee> querySix(@Param("id") String id);
 	
 	//Paging Results
 	//1.default available in main class
 	//employeeRepo.findAll(new PageRequest(0, 2)).forEach(s -> System.out.println("Paging Results - "+s));
	
 	//2.Conditional paging
 	//another way is if u want put condition like find all ids greater 10 in pagination
 	//   or suppose u have lot of books and u need show books with greater than 200 pages in pagination
 	//in this case we need construct a condition.
 	//such is below method
 	public List<Employee> findByIdGreaterThan(String id, Pageable pageable);
 	
 	//Sorting results
 	//1.default
 	//2.conditional
 	public List<Employee> findByIdGreaterThan(String id, Sort sort);
 	
 	//Different return types
 	public Page<Employee> findByNameGreaterThan(String id, Pageable pageable);
 	
}
