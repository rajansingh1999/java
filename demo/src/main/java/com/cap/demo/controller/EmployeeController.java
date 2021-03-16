package com.cap.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.demo.entity.Employee;
import com.cap.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/Employee")//optional
public class EmployeeController {//http://localhost:1234/getEmployee/123

	@Autowired
	EmployeeServiceImpl service;
	@GetMapping("/getEmployee/{tid}")//mand//json
	public Employee getEmployeeById(@PathVariable("tid") int EmployeeId)
		{
		System.out.println(service.getEmployeeById(EmployeeId));
			return service.getEmployeeById(EmployeeId);
		}
	//@RequestMapping(value="/addEmployee",method =RequestMethod.POST)//mand//json
	@PostMapping("/addEmployee")//http://localhost:1234/Employee/addEmployee
	public int addEmployee(@RequestBody Employee Employee)//get,post,put,delete
		{
		return service.addEmployee(Employee);
			
		}
	@PutMapping("/updateEmployee")//http://localhost:1234/Employee/updateEmployee
	public Employee updateEmployee(@RequestBody Employee Employee)//get,post,put,delete
		{
		return service.updateEmployee(Employee);
			
		}
	@DeleteMapping("/deleteEmployee/{tid}")//http://localhost:1234/Employee/updateEmployee
	public String deleteEmployee(@PathVariable("tid") int EmployeeId)//get,post,put,delete
		{
		 service.removeEmployee(EmployeeId);
			return "deleted successfully";
		}
	@GetMapping("/getAllEmployees")//http://localhost:1234/Employee/updateEmployee
	public List<Employee> fetchAllEmployees()//get,post,put,delete
		{
		return service.getAllEmployees();
			
		}
}

