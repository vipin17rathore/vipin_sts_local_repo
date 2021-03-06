package com.boa.databbase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boa.databbase.bean.Person;
import com.boa.databbase.dao.PersonDao;

@SpringBootApplication
public class DatabbaseApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonDao personDao;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabbaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person person=new Person();
		person.setId(4);
		person.setName("Vipin4");
		person.setLocation("Foolistan");
		logger.info("insertPerson {}",personDao.createPerson(person));
		logger.info("getAllPersons ->{} , \n length {}",personDao.getAllPersons(),personDao.getAllPersons().size());
		logger.info("getPersonById ->{}",personDao.getPersonById(1));
		logger.info("deletePersonById ->{}",personDao.deletePersonById(2));
		logger.info("updatePersonById ->{}",personDao.updatePersonById(1));
		
	}

}
