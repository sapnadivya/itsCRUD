package com.example.practice_restApis.repository;

import com.example.practice_restApis.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {




}
