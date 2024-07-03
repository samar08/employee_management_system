package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}


