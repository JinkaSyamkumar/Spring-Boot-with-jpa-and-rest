package com.learning.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.learning.demo.entity.Credentials;

public interface CredEntityRepo extends CrudRepository<Credentials, Integer> {

}
