package dao;

//I
//for the dept table
public class Department { 
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
