package com.example.testcontainers.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "employee")
public class Employee {
    @Id
    @Column(name = "emp_id")
    private int employeeId;

    @Column(name = "f_name")
    private String firstName;

    @Column(name = "l_name")
    private String lastName;
}
