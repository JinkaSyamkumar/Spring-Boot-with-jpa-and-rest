package com.learning.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManyToManyWith3Tables2JoinApplication {

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(ManyToManyWith3Tables2JoinApplication.class, args);
	}
}
