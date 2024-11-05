package com.vishal.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/*
 * 
 * e= em.find(Employee.class,101);
 *  e.  
 * 
 */
@Entity
@Table(name="employee7")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="empno")
	private int employeeNumber;
	
	@Column(name="ename")
	private String employeeName;

	@Column(name="sal")
	private double employeeSalary;

	@OneToMany(mappedBy="employee")
	Set<Address> addresses = new HashSet<Address>();

	
	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	
	
	
	
}
