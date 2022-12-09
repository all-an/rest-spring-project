package com.restful.project.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restful.project.exceptions.UnsuportedMathOperationException;
import com.restful.project.math.conversors.NumberConverter;

@RestController
public class PersonController {
	

    @SuppressWarnings("unused")
	private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if(!conversor.isNumeric(numberOne) || !conversor.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return conversor.convertToDouble(numberOne) + conversor.convertToDouble(numberTwo);

    }
    
}
