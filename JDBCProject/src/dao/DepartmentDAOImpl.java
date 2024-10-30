package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//III
//implementation class
public class DepartmentDAOImpl implements DepartmentDAO {

	Connection conn;
	
	public DepartmentDAOImpl() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded....");
			
			//2. acquire the connection
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql",
					"root","root123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected ..."+conn);
	
	}
	
	@Override
	public void insertDepartment(Department dept) {
		try {
			PreparedStatement pst= conn.prepareStatement("insert into dept values (?,?,?)");
			System.out.println("PreparedStatement created...");
				
			pst.setInt(1, dept.getDepartmentNumber());
			pst.setString(2, dept.getDepartmentName());
			pst.setString(3, dept.getDepartmentLocation());
			
			pst.executeUpdate();
			System.out.println("Insert Query fired... ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Department selectDepartment(int deptNumber) {
		Department dept = null;
		try {
			Statement st= conn.createStatement();
			System.out.println("Statement created...");
			ResultSet rs = st.executeQuery("select * from dept where deptno="+deptNumber);
			System.out.println("result set ...");

			if(rs.next()) {
				dept = new Department(); //EMPTY
				
				dept.setDepartmentNumber(rs.getInt(1)); //fillup
				dept.setDepartmentName(rs.getString(2));
				dept.setDepartmentLocation(rs.getString(3));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dept; //return to the invoker

	}

	@Override
	public List<Department> selectAllDepartments() {
		
		List<Department> deptList = new ArrayList<Department>();

		Department dept = null;
		
		try {
			Statement st= conn.createStatement();
			System.out.println("Statement created...");
			ResultSet rs = st.executeQuery("select * from dept");
			System.out.println("result set ...");
			
			while(rs.next()) {
				dept = new Department(); //EMPTY
				
				dept.setDepartmentNumber(rs.getInt(1)); //fillup
				dept.setDepartmentName(rs.getString(2));
				dept.setDepartmentLocation(rs.getString(3));	
				
				deptList.add(dept);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deptList; //return to the invoker
		
	}

	@Override
	public void updateDepartment(Department dept) {
		try {
			PreparedStatement pst= conn.prepareStatement("UPDATE DEPT SET DNAME=?, LOC=? where DEPTNO=?");
			System.out.println("PreparedStatement created...");
					

				
			pst.setString(1, dept.getDepartmentName());
			pst.setString(2, dept.getDepartmentLocation());
			pst.setInt(3, dept.getDepartmentNumber());

			int rows = pst.executeUpdate();
			System.out.println("UPDATE Query fired... "+rows+ " updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		

	}
//Exception DepartmentNotFoundException is not compatible 
	//with throws clause in DepartmentDAO.deleteDepartment(int)
	
	@Override
	public void deleteDepartment(int deptNumber) throws DepartmentNotFoundException
	{
		try {
			PreparedStatement pst= conn.prepareStatement("DELETE FROM DEPT WHERE DEPTNO=?");

			System.out.println("PreparedStatement created...");
			
			
			pst.setInt(1, deptNumber);

			int rows = pst.executeUpdate();
			if(rows==0) {
				DepartmentNotFoundException ex = new DepartmentNotFoundException("Department with this id does not exist!!! : "+deptNumber);
				throw ex;
			}
			else {
				System.out.println("DELETE Query fired... "+rows+ " DELETED");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
