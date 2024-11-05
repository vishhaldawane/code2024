package com.vishal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//hibernate = department.hbm.xml

//but in JPA = no such hbm file required

@Entity //the one with primary key is known as entity
@Table(name="dept6") //for the DB
public class Department { //for java pojo

	@Id
	@Column(name="deptno") //for the DB table
	private int deptNumber; //for java pojo

	@Column(name="dname")
	private String deptName;
	
	@Column(name="loc")
	private String deptLocation;

	
	
	
	public Department() {
		super();
		System.out.println("Department ctor....");
	}

	public int getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	
	
}
/*
		dept6 <-- tablename
		deptno	dname	loc <-- fields
*/