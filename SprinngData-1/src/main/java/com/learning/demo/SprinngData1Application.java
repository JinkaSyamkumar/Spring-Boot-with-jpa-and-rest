package com.learning.demo;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.learning.demo.entity.Employee;
import com.learning.demo.entity.SingleTable;
import com.learning.demo.entity.SkillSet;
import com.learning.demo.repo.EmployeeRepo;
import com.learning.demo.repo.SingleTableRepo;
import com.learning.demo.repo.SingleTableRepoImpl;

@SpringBootApplication
//@EnableJpaRepositories(repositoryBaseClass = SingleTableRepoImpl.class)
public class SprinngData1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SprinngData1Application.class, args);
		
		SingleTableRepo srepo = context.getBean(SingleTableRepo.class);
		
		SingleTable st = new SingleTable();
		st.setId(4);
		st.setName("Hi");
		srepo.save(st);
		//Derived query
		List<SingleTable> ss1= srepo.findByName("syam");
		ss1.forEach(s -> System.out.println("findByName -> "+s.getName()));
		
		//String operator
		List<SingleTable> ss2= srepo.findByNameLike("syam");
		ss2.forEach(s -> System.out.println("findByNameLike -> "+s.getName()));
		
		List<SingleTable> ss3= srepo.findByNameContaining("syam");
		ss3.forEach(s -> System.out.println("findByNameContaining -> "+s.getName()));
		
		List<SingleTable> ss4= srepo.findByNameStartingWith("syam");
		ss4.forEach(s -> System.out.println("findByNameStartingWith -> "+s.getName()));
		
		List<SingleTable> ss5= srepo.findByNameEndingWith("syam");
		ss5.forEach(s -> System.out.println("findByNameEndingWith -> "+s.getName()));
		
		List<SingleTable> ss6= srepo.findByNameIgnoreCase("syam");
		ss6.forEach(s -> System.out.println("findByNameIgnoreCase -> "+s.getName()));
		
		//Relational Operators
		List<SingleTable> ss7= srepo.findByIdEquals(1);
		ss7.forEach(s -> System.out.println("findByIdEquals -> "+s.getName()));
		
		List<SingleTable> ss8= srepo.findByIdGreaterThan(2);
		ss8.forEach(s -> System.out.println("findByIdGreaterThan -> "+s.getName()));
	
		List<SingleTable> ss9= srepo.findByIdLessThan(3);
		ss9.forEach(s -> System.out.println("findByIdLessThan -> "+s.getName()));
		
		List<SingleTable> ss10= srepo.findByIdGreaterThanEqual(2);
		ss10.forEach(s -> System.out.println("findByIdGreaterThanEqual -> "+s.getName()));
		
		List<SingleTable> ss11= srepo.findByIdLessThanEqual(1);
		ss11.forEach(s -> System.out.println("findByIdLessThanEqual -> "+s.getName()));
		
		//Logical Operators
		List<SingleTable> sa1= srepo.findByNameContainingOrNameContaining("syam","sravs");
		sa1.forEach(s -> System.out.println("findByNameContainingOrNameContaining -> "+s.getName()));
		
		List<SingleTable> sa2= srepo.findByIdAndNameContaining(2,"syam");
		sa2.forEach(s -> System.out.println("findByIdAndNameContaining -> "+s.getName()));
	
		List<SingleTable> sa3= srepo.findByIdNot(3);
		sa3.forEach(s -> System.out.println("findByIdNot -> "+s.getName()));
		
		//Date Comparisons
/*		Date date = new SimpleDateFormat("MM/dd/yyyy").parse("10/22/1995");
		Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse("10/22/1995");
		List<SingleTable> sd1= srepo.findByDob(date);
		List<SingleTable> sd2= srepo.findByDobAfter(date);
		List<SingleTable> sd3= srepo.findByDobBefore(date);
		List<SingleTable> sd4= srepo.findByDobBetween(date,date1);*/
		
		//Ordering Results
		List<SingleTable> s01= srepo.findByIdLessThanOrderByNameAsc(4);
		s01.forEach(s -> System.out.println("findByIdLessThanOrderByNameAsc -> "+s.getName()));
		
		List<SingleTable> s02= srepo.findByIdLessThanOrderByNameDesc(4);
		s02.forEach(s -> System.out.println("findByIdLessThanOrderByNameDesc -> "+s.getName()));
		
		//Limiting Query Results
		List<SingleTable> so1= srepo.findTopByOrderByNameAsc();
		so1.forEach(s -> System.out.println("Limiting Query Results - findTopByOrderByNameAsc -> "+s.getName()));
		
		List<SingleTable> so2= srepo.findFirstByOrderByNameAsc();
		so2.forEach(s -> System.out.println("Limiting Query Results - findFirstByOrderByNameAsc -> "+s.getName()));
		
		List<SingleTable> so3= srepo.findTop3ByOrderByNameAsc();
		so3.forEach(s -> System.out.println("Limiting Query Results - findTop3ByOrderByNameAsc -> "+s.getName()));
		
		List<SingleTable> so4= srepo.findFirst3ByOrderByNameAsc();
		so4.forEach(s -> System.out.println("Limiting Query Results - findFirst3ByOrderByNameAsc -> "+s.getName()));

		List<SingleTable> so5= srepo.findTop3ByIdOrderByNameAsc(4);
		so5.forEach(s -> System.out.println("Limiting Query Results - findTop3ByIdOrderByNameAsc -> "+s.getName()));
		
		List<SingleTable> so6= srepo.findFirst3ByNameOrderByIdAsc("syam");
		so6.forEach(s -> System.out.println("Limiting Query Results - findFirst3ByNameOrderByIdAsc -> "+s.getName()));
		
		//Transversiong nested properties
		EmployeeRepo employeeRepo = context.getBean(EmployeeRepo.class);
		List<Employee> ses= employeeRepo.findBySkillSetsTechName("JAVA");
		ses.forEach(s -> System.out.println("Transversiong nested properties - findBySkillSetsTechName -> "+s.getId()));
		
		List<Employee> ses1= employeeRepo.findBySkillSets_Id(4);
		ses1.forEach(s -> System.out.println("Transversiong nested properties - underscore- findBySkillSets_Id -> "+s.getId()));
		
		//@Query annotation
		List<Employee> sQuery1= employeeRepo.queryOne();
		sQuery1.forEach(s -> System.out.println("@Query - "+s.getId()));
		
		List<Employee> sQuery2= employeeRepo.queryTwo("JINKSY04");
		sQuery2.forEach(s -> System.out.println("@Query with positional parameter - "+s.getName()));
		
		List<Employee> sQuery3= employeeRepo.queryThree("JINKSY04");
		sQuery3.forEach(s -> System.out.println("@Query with named parameter - "+s.getName()));
		
		//@NamedQuery annotation
		List<Employee> sNQuery1= employeeRepo.queryFour();
		sNQuery1.forEach(s -> System.out.println("@NamedQuery - "+s.getId()));
		
		List<Employee> sNQuery2= employeeRepo.queryFive("JINKSY04");
		sNQuery2.forEach(s -> System.out.println("@NamedQuery with positional parameter - "+s.getName()));
		
		List<Employee> sNQuery3= employeeRepo.querySix("JINKSY04");
		sNQuery3.forEach(s -> System.out.println("@NamedQuery with named parameter - "+s.getName()));
		
		//PAGING Results
		//default
		employeeRepo.findAll(new PageRequest(0, 4)).
				forEach(s -> System.out.println("Paging Results - "+s));;
		
		//conditional
		employeeRepo.findByIdGreaterThan("JINKSY04",  new PageRequest(0, 2))
		.forEach(s -> System.out.println("Paging Results - conditional -"+s));
		
		//Sorting Results
		//default
		employeeRepo.findAll(new Sort("id")).
				forEach(s -> System.out.println("Sorting Results - sinle property - "+s));;
		//sort by direction(asc) and property
		employeeRepo.findAll(new Sort(Direction.ASC,"id")).
				forEach(s -> System.out.println("Sorting Results - direction ASC and single property "+s));;
		//direction (desc) and property
		employeeRepo.findAll(new Sort(Direction.DESC,"id")).
						forEach(s -> System.out.println("Sorting Results - direction DESC and single property "+s));;
		//direction and multiple props
		employeeRepo.findAll(new Sort(Direction.DESC,"name","id")).
						forEach(s -> System.out.println("Sorting Results - direction and multiple properties "+s));;
		//direction and multiple props - nested
		employeeRepo.findAll(new Sort(Direction.DESC,"skillSets.techName","id")).
						forEach(s -> System.out.println("Sorting Results - direction and multiple properties "+s));;
		//we can add multiple sorts 
		employeeRepo.findAll(new Sort(Direction.DESC,"skillSets.techName").and(new Sort(Direction.DESC,"id"))).
						forEach(s -> System.out.println("Sorting Results - multiple sorts with AND- "+s));;		
		//Conditional
		employeeRepo.findByIdGreaterThan("JINKSY04", new Sort(Direction.DESC,"id") )
						.forEach(s -> System.out.println("Paging Results - conditional -"+s));
		
		//Different return types
		//along with collection and iterable
		//page
		Page<Employee> page = employeeRepo.findByNameGreaterThan("JINKSY04",  new PageRequest(0, 2));
		long totalElements= page.getTotalElements();
		int totalPages= page.getTotalPages();
		System.out.println("totalElements - "+totalElements+"-totalPages-"+totalPages);
		//slice
		System.out.println("slice--------------");
		Slice<SingleTable> slices = srepo.findById(1, new PageRequest(0, 2));
		slices.getContent().forEach(s -> System.out.println("get content"+s));
		System.out.println("slices.getNumber();"+slices.getNumber());
		System.out.println("slices.getNumberOfElements();"+slices.getNumberOfElements());
		System.out.println("getSize"+slices.getSize());
		
		System.out.println("getSort");
		//slices.getSort().forEach(s -> System.out.println("get content"+s));	
		System.out.println("hascontent"+slices.hasContent());
		
		System.out.println("hasNext"+slices.hasNext());
		
		System.out.println("hasPrevious"+slices.hasPrevious());
		
		System.out.println("isFirst"+slices.isFirst());
		
		System.out.println("isLast"+slices.isLast());
		
		System.out.println("nextpageble"+slices.nextPageable());
		System.out.println("nextpageble"+slices.previousPageable());
		
		//Custom repo -local
		SingleTable singleTable = new SingleTable();
		singleTable.setId(999);
		singleTable.setName("custom");
		System.out.println("Custom Repo - LOCAL - calling custom repo method");
	//modify id and uncomment	srepo.createDetails(singleTable);
		
		//Custom Repo - global
		//employeeRepo.findByIds("JINKSY04", "JINKSY05") 
		//						.forEach(s -> System.out.println("Custom Repo - GLOBAL -"+s));
		
		
	}
}
