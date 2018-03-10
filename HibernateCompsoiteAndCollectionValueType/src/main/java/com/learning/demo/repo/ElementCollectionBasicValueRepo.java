package com.learning.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.learning.demo.entity.ElementCollectionBasicValueTypes;

public interface ElementCollectionBasicValueRepo extends CrudRepository<ElementCollectionBasicValueTypes, Integer> {

}
