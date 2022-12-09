package com.restful.project.math;

import com.restful.project.exceptions.UnsuportedMathOperationException;
import com.restful.project.math.conversors.NumberConverter;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
	
	private final NumberConverter conversor = new NumberConverter();

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
    
    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if(!conversor.isNumeric(numberOne) || !conversor.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return conversor.convertToDouble(numberOne) * conversor.convertToDouble(numberTwo);

    }
    
    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if(!conversor.isNumeric(numberOne) || !conversor.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return conversor.convertToDouble(numberOne) - conversor.convertToDouble(numberTwo);

    }
    
    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if(!conversor.isNumeric(numberOne) || !conversor.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return conversor.convertToDouble(numberOne) / conversor.convertToDouble(numberTwo);

    }
    
    @RequestMapping(value = "/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double average(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if(!conversor.isNumeric(numberOne) || !conversor.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return (conversor.convertToDouble(numberOne) + conversor.convertToDouble(numberTwo)) / 2;

    }
    
    @RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable(value = "numberOne") String numberOne) throws Exception {

        if(!conversor.isNumeric(numberOne)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return Math.sqrt((conversor.convertToDouble(numberOne)));

    }
}
