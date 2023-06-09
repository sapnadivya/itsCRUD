package com.example.practice_restApis.controller;

import javax.persistence.Id;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(long id) {
        super("could not find employee with this Id "+ id);
    }
}
