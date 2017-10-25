package com.learning.demo.repo;

import org.springframework.data.repository.CrudRepository;


import com.learning.demo.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
