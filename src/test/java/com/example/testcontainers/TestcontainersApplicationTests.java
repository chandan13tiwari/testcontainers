package com.example.testcontainers;

import com.example.testcontainers.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
class TestcontainersApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void successScenarioTest() {
		Assertions.assertEquals(2, employeeRepository.findAll().size());
	}

}
