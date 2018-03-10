package com.learning.apitest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.learning.apitest.entity.ProductItem;

@RepositoryRestResource(collectionResourceRel="efeatures", path="efeatures")
public interface RefRepo extends JpaRepository<ProductItem, Integer> {

	public List<ProductItem> findByBrand(@Param("brand")String brand);

	//To get all the methods of JpaRepository interface
	//command+two touch click --> and select --> source --> override/implement methods


	@Override
	@RestResource(exported=false)
	<S extends ProductItem> List<S> save(Iterable<S> entities) ;

	//if exported is false, people can not try save in POST way
	//It wont be shown when u do http://localhost:8080/efeatures/search or http://localhost:8080/efeatures
	//will be avilable by default if u open postman/rest client in POST mode and try http://localhost:8080/efeatures
	
}
