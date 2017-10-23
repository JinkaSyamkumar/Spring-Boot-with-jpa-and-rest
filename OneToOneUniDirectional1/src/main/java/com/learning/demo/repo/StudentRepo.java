package com.learning.demo.repo;

import org.springframework.data.repository.CrudRepository;


import com.learning.demo.entity.StudentEntity;

public interface StudentRepo extends CrudRepository<StudentEntity, Integer> {

}
