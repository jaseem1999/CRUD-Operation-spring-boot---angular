package com.example.demo.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.dto.Employee;
import com.example.demo.employee.repository.RepositoryEmployee;


@Service
public class EmployeeServices {
	
	@Autowired
	RepositoryEmployee res;
	public Employee saveEmployee(Employee emp) {
		res.save(emp);
		return emp;
	}
	public Employee updateEmployee(Employee emp) {
		res.save(emp);
		return emp;
	}
	public java.util.List<Employee> getEmp() {
		return res.findAll();
	}
	
	public Employee getEmpById(long id) {
		return res.findById(id).orElse(null);
	}
	
	public Employee deleteEmp(long id) {
			  Employee emp = res.findById(id).orElse(null);
		      res.deleteById(id);
		      return emp;
		
	}
	
}
