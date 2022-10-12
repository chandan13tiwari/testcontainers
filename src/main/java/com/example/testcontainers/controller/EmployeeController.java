package com.example.testcontainers.controller;

import com.example.testcontainers.entity.Employee;
import com.example.testcontainers.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
