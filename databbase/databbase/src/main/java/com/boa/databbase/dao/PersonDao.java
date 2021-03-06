package com.boa.databbase.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.boa.databbase.bean.Person;

@Repository
public class PersonDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Person> getAllPersons() {
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person getPersonById(int id) {
		return jdbcTemplate.queryForObject("select * from person where id = ?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public int deletePersonById(int id) {
		return jdbcTemplate.update("delete from person where id = ?", new Object[] { id });
	}
	
	public int updatePersonById(int id) {
	    return jdbcTemplate.update("update person set location='Indore' where id = ?", new Object[] { id });
	}
	
	public int createPerson(Person person) {
		return jdbcTemplate.update("insert into person values(?,?,?)",new Object[] { 
				person.getId(),person.getName(),person.getLocation() });
				}
}
