package com.cap.demo.service;

import java.util.List;

import com.cap.demo.entity.Employee;

public interface EmployeeService {

		int addEmployee(Employee Employee);

		Employee updateEmployee(Employee Employee);

		void removeEmployee(int EmployeeId);

		Employee getEmployeeById(int EmployeeId);

		List<Employee> getAllEmployees();
	
}
