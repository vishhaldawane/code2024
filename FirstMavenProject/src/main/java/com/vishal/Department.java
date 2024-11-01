package com.vishal;

//1. make a pojo as per the table structure

//1.1 : below class would be mapped with the actual table
public class Department {

	//1.2 : below column would be the primary key
	private int departmentNumber;
		
	private String departmentName;
	private String departmentLocation;
	
	
	public Department() {
		System.out.println("Department() ctor...");
	}


	public int getDepartmentNumber() {
		return departmentNumber;
	}


	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDepartmentLocation() {
		return departmentLocation;
	}


	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
}
