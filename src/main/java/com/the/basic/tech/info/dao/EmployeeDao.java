package com.the.basic.tech.info.dao;

import java.util.List;

import com.the.basic.tech.info.model.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee cus);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(String empId);
}