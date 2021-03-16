package com.cap.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees1")
public class Employee {
	@Id
	@GeneratedValue
	@Column(length = 10)
	private int EmployeeId;
	@Column(length = 10)
	private String EmployeeName;
	@Column(length = 20)
	private String EmployeeBatch;

	public Employee(int EmployeeId, String EmployeeName, String EmployeeBatch) {
		super();
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		this.EmployeeBatch = EmployeeBatch;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}

	public String getEmployeeBatch() {
		return EmployeeBatch;
	}

	public void setEmployeeBatch(String EmployeeBatch) {
		this.EmployeeBatch = EmployeeBatch;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeBatch=" + EmployeeBatch
				+ "]";
	}

	public Employee( String EmployeeName, String EmployeeBatch) {
		super();
		this.EmployeeName = EmployeeName;
		this.EmployeeBatch = EmployeeBatch;
	}

}

