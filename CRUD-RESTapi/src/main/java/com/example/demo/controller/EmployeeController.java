package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employee.dto.Employee;
import com.example.demo.employee.services.EmployeeServices;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/emp/")
public class EmployeeController {
	
	@Autowired
	EmployeeServices ser;

	@PostMapping(path = "/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		ser.saveEmployee(emp);
		return emp;
	}
	
	@PutMapping(path = "/add")
	public Employee updatedEmployee(@RequestBody Employee emp) {
		ser.updateEmployee(emp);
		return emp;
	}
	
	@GetMapping(path = "/get")
	public List<Employee> getAllEmployee(){
		return ser.getEmp();
	}
	
	
	@GetMapping(path = "/get/{id}")
	public Employee getEmployeeId(@PathVariable("id") long id) {
		return ser.getEmpById(id);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public Employee deleteById(@PathVariable("id") long id) {
		return ser.deleteEmp(id);
	}
}
