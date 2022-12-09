package com.restful.project.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.restful.project.model.Person;

@Service
public class PersonService {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public Person findById(String id) {
		
		logger.info("Finding a person!");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("James");
		person.setLastName("Gosling");
		person.setAddress("Lages - SC");
		person.setGender("Male");
		
		return person;
	}

}
