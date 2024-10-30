package model;

import java.sql.Date;

//the fields of below class
//are as per the employee table

public class Employee {

	private int employeeNumber; //for empno
	private String employeeName;//ename
	private String job; //job
	private int managerCode;
	private Date hiringDate;
	private int salary;
	private int commission;
	
	public Employee() {
		super();
		System.out.println("Employee() ctor...invoked...");
		// TODO Auto-generated constructor stub
	}



	//below column is for my table
	private int departmentNumber;



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



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public int getManagerCode() {
		return managerCode;
	}



	public void setManagerCode(int managerCode) {
		this.managerCode = managerCode;
	}



	public Date getHiringDate() {
		return hiringDate;
	}



	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getCommission() {
		return commission;
	}



	public void setCommission(int commission) {
		this.commission = commission;
	}



	public int getDepartmentNumber() {
		return departmentNumber;
	}



	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	
	
	
}










