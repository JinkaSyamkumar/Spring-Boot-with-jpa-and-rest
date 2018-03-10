package com.learning.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.learning.demo.entity.Bank;

public interface BankRepo extends CrudRepository<Bank, Integer> {

}
