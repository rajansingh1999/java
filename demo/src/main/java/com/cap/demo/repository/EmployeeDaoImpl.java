package com.cap.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cap.demo.entity.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	EntityManager entityManager;

	public int addEmployee(Employee Employee) {
		entityManager.persist(Employee);
		return Employee.getEmployeeId();
	}

	public Employee updateEmployee(Employee Employee) {
		return entityManager.merge(Employee);
	}

	public void removeEmployee(int EmployeeId) {
		Employee Employee = entityManager.find(Employee.class, EmployeeId);
		entityManager.remove(entityManager.merge(Employee));

	}

	public Employee getEmployeeById(int EmployeeId) {
		Employee Employee = entityManager.find(Employee.class, EmployeeId);
		return Employee;
	}

	public List<Employee> getAllEmployees() {
		Query q = entityManager.createQuery("select e from Employee e");
		List<Employee> l = q.getResultList();
		return l;
	}

}

