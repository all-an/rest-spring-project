package com.restful.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restful.project.model.Person;
import com.restful.project.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	

	@Autowired
    private PersonService personService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") String id) throws Exception {

    	return personService.findById(id);

    } 
    
    @RequestMapping(method = RequestMethod.GET, 
    				consumes = MediaType.APPLICATION_JSON_VALUE,
    				produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() throws Exception {

    	return personService.findAll();

    }
    
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) throws Exception {

    	return personService.create(person);

    } 
    
}
