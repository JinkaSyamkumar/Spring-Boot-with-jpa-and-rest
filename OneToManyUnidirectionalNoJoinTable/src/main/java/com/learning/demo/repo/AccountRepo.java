package com.learning.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.learning.demo.entity.Account;

public interface AccountRepo extends CrudRepository<Account, Integer> {

}
