package com.example.demo.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.employee.dto.Employee;
import com.example.demo.employee.dto.EmployeeImage;

@Repository
public interface EmployeeProfile extends JpaRepository<EmployeeImage, Long> {
	Optional<EmployeeImage> findByEmp(Employee emp);
}
