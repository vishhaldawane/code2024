import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;

public class UpdateTest {

	public static void main(String[] args) {
		//1. load the driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded....");
			
			//2. acquire the connection
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql",
					"root","root123");
			System.out.println("Connected ..."+conn);
			PreparedStatement pst= conn.prepareStatement("UPDATE EMP SET JOB=?, SAL=?, COMM=? WHERE EMPNO=?");
			System.out.println("PreparedStatement created...");
					
			Scanner scan = new Scanner(System.in);
			
						
			System.out.println("Enter NEW JOB   : ");	
			String job =  scan.next();
			
			System.out.println("Enter NEW SAL   : ");	
			int salary = scan.nextInt();
			
			System.out.println("Enter NEW COMM  : ");	
			int comm = scan.nextInt();
			
			System.out.println("FOR WHICH EMPNO ? ");	
			int empno = scan.nextInt();
				
			pst.setString(1, job);
			pst.setInt(2, salary);
			pst.setInt(3, comm);
			pst.setInt(4, empno);

			int rows = pst.executeUpdate();
			System.out.println("UPDATE Query fired... "+rows+ " updated");
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
