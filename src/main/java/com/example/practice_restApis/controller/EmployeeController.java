package com.example.practice_restApis.controller;

import com.example.practice_restApis.model.Employee;
import com.example.practice_restApis.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    private List<Employee> getAllEmployee() {
        return employeeRepository.findAll();   /*findall() helps to call all method of repository class*/

    }

    @GetMapping(value = "/employees/{id}")
    private Employee getEmployeeById(@PathVariable long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));   /*findall() helps to call all method of repository class*/

    }

    @PostMapping(value = "/employees")
    private Employee AddEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);

    }

    @PutMapping(value = "/employees/{id}")
    public ResponseEntity<?> UpdateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        try {
            Employee employeeExists = getEmployeeById(id);
            return new ResponseEntity<Employee>(employee, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Employee>(employee, HttpStatus.NOT_FOUND);

        }


    }


}
