package com.learning.demo.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learning.demo.entity.Employee;
import com.learning.demo.entity.SingleTable;

public interface SingleTableRepo extends JpaRepository<SingleTable, Integer> , SingleTableRepoCustom{

	//Derived
	public List<SingleTable> findByName(String name);
	
	//String operator like 
	public List<SingleTable> findByNameLike(String name);

	public List<SingleTable> findByNameContaining(String name);
	
	public List<SingleTable> findByNameStartingWith(String name);
	
	public List<SingleTable> findByNameEndingWith(String name);

	public List<SingleTable> findByNameIgnoreCase(String name);
	
	//Relational Operators, = > < >= <= !=
	public List<SingleTable> findByIdEquals(int id);
	public List<SingleTable> findByIdGreaterThan(int id);
	public List<SingleTable> findByIdLessThan(int id);
	public List<SingleTable> findByIdGreaterThanEqual(int id);
	public List<SingleTable> findByIdLessThanEqual(int id);
	public List<SingleTable> findByIdBetween(int idMin, int idMax);
	
	//Logical Operators - helps to work with multiple conditions - allows to connect two or more, And , Or
	//Or
	public List<SingleTable> findByNameContainingOrNameContaining(String name1,String name2);//checking for two name
	//And
	public List<SingleTable> findByIdAndNameContaining(int id,String name2);
	//Negate
	public List<SingleTable> findByIdNot(int id);
	
	//Date Comparisons
/*	public List<SingleTable> findByDob(Date date);
	public List<SingleTable> findByDobAfter(Date date);
	public List<SingleTable> findByDobBefore(Date date);
	public List<SingleTable> findByDobBetween(Date date1, Date date2);*/
	
	//Ordering Results - based on keywords
	public List<SingleTable> findByIdLessThanOrderByNameAsc(int id);
	public List<SingleTable> findByIdLessThanOrderByNameDesc(int id);
	
	//Limiting Query Results - First and Top - to limit the results returned
	//Top and First - same
	public List<SingleTable> findTopByOrderByNameAsc();
	public List<SingleTable> findFirstByOrderByNameAsc();
	//if u want to pass the count
	//Top5BY and First5By
	public List<SingleTable> findTop3ByOrderByNameAsc();
	public List<SingleTable> findFirst3ByOrderByNameAsc();
	//with diff columns
	public List<SingleTable> findTop3ByIdOrderByNameAsc(int id);
	public List<SingleTable> findFirst3ByNameOrderByIdAsc(String name);
	
	//Transversing Nested properties
	
	//in relation mapping we will have nexted properties ex
	//ex employee has skillsets , and skillset has its own fields
	//skillset by id- ie transversiong relation
	//check in employeerepo.java
	//findBySkillSetsTechName
	//first it will check for SkillSetsTechName
	//but there is no such property so it will split with diff combinations
	//SkillSets TechName and finally it tranverses and maps
	
	//public List<Employee> findBySkillSetsTechName(String techName);
	
	//Query annotation
 	
	//@Query("select e from Employee e")
 	//public List<Employee> queryOne();
 	
 	//supplied argument - ?1
 	//@Query("select e from employee where e.id>=?1")
 	//public List<Employee> queryTwo(int id);
 	
 	//avoid positional parameter instead use named parameter
 	//@Query("select e from employee where e.id>=:id")
 	//public List<Employee> queryThree(@Param("id") int id);
	
	public Slice<SingleTable> findById(int id, Pageable pageble);
	
	
	
	
	
	
	
	
}
