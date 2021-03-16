package com.cap.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.entity.Employee;
import com.cap.demo.repository.EmployeeDao;


@Service("service") // EmployeeServiceImpl service=new EmployeeServiceImpl()
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	public int addEmployee(Employee Employee) {
		return dao.addEmployee(Employee);
	}

	public Employee updateEmployee(Employee Employee) {
		return dao.updateEmployee(Employee);
	}

	public void removeEmployee(int EmployeeId) {
		dao.removeEmployee(EmployeeId);
	}

	public Employee getEmployeeById(int EmployeeId) {
		return dao.getEmployeeById(EmployeeId);
	}

	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

}
