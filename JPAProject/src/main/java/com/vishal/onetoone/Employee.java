package com.vishal.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
/*
 * 
 * e= em.find(Employee.class,101);
 *  e.  
 * 
 */
@Entity
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="empno")
	private int employeeNumber;
	
	@Column(name="ename")
	private String employeeName;

	@Column(name="sal")
	private double employeeSalary;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pno",
	    referencedColumnName = 
	         "passport_no"
	)
	Passport passport; //hasA
	
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

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	
}
