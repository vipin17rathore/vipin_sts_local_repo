package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;

@Service
public class PersonJpaRepositoryImpl {

	@Autowired
	PersonRepository prRepo;

	public List<Person> allPerson() {
		return prRepo.findAll();
	}

	public Optional<Person> personById(int id) {
		return prRepo.findById(id);
	}

	public Person addPerson(Person person) {
		return prRepo.save(person);
	}

}