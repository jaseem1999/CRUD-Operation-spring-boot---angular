package com.example.demo.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.employee.dto.Employee;

@Repository
public interface RepositoryEmployee extends JpaRepository<Employee, Long> {
  	
}
