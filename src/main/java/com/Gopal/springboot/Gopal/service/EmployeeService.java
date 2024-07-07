package com.Gopal.springboot.Gopal.service;

import java.util.List;

import com.Gopal.springboot.Gopal.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
