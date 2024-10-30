import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Database;
import model.Employee;

public class SelectTestWithModel {

	public static void main(String[] args) {
		//1. load the driver
		try {
			Connection conn = Database.getConnection();
			Statement st= conn.createStatement();
			System.out.println("Statement created...");
			ResultSet rs = st.executeQuery("select * from emp");
			System.out.println("result set ...");
			
			
			//List<Employee> empList = new ArrayList<Employee>();
			
			while(rs.next()) { //14 rows
				Employee emp = new Employee(); // a blank object created
				//lets populate values into the bean class's object
				//from the result of the current row
				
				emp.setEmployeeNumber(rs.getInt(1));		
				emp.setEmployeeName(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setManagerCode(rs.getInt(4));
				emp.setHiringDate(rs.getDate(5));
				emp.setSalary(rs.getInt(6));
				emp.setCommission(rs.getInt(7));
				emp.setDepartmentNumber(rs.getInt(8));
				
				//empList.add(emp);
				System.out.println("EMPNO : "+emp.getEmployeeNumber());
				System.out.println("ENAME : "+emp.getEmployeeName());
				System.out.println("JOB   : "+emp.getJob());
				System.out.println("MGR   : "+emp.getManagerCode());
				System.out.println("HIRING: "+emp.getHiringDate());
				System.out.println("SAL   : "+emp.getSalary());
				System.out.println("COMM  : "+emp.getCommission());
				System.out.println("DNO   : "+emp.getDepartmentNumber());
				System.out.println("-----------------");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
