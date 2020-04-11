package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonJpaRepositoryImpl;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

	@Autowired
	PersonJpaRepositoryImpl jpaImpl;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("get by id-->{}",jpaImpl.personById(5));
		logger.info("create-->{}",jpaImpl.addPerson(new Person(3, "QWE", "location")));
		logger.info("get-->{}",jpaImpl.allPerson());		
	}

}
