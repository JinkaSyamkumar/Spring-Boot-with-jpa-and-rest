package com.learning.demo.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.demo.data.entity.Sme3;

public interface SMERepo extends JpaRepository<Sme3, Long> {

}
