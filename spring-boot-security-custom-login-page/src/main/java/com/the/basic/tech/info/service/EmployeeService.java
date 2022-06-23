package com.the.basic.tech.info.service;

import java.util.List;

import com.the.basic.tech.info.model.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	void getEmployeeById(String empid);
}