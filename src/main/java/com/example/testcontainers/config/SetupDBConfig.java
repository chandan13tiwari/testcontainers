package com.example.testcontainers.config;

import com.example.testcontainers.entity.Employee;
import com.example.testcontainers.repository.EmployeeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SetupDBConfig {
    private final EmployeeRepository employeeRepository;

    public SetupDBConfig(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Bean
    public void setupDB() {
        Employee employee1 = Employee.builder()
                .employeeId(1)
                .firstName("Chandan")
                .lastName("Tiwari")
                .build();

        Employee employee2 = Employee.builder()
                .employeeId(2)
                .firstName("Arijit")
                .lastName("Singh")
                .build();

        employeeRepository.saveAll(Arrays.asList(employee1, employee2));
    }
}
