import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;

public class DeleteTest {

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
			PreparedStatement pst= conn.prepareStatement("DELETE FROM EMP WHERE EMPNO=?");
			System.out.println("PreparedStatement created...");
					
			Scanner scan = new Scanner(System.in);
			
			System.out.println("ENTER EMPNO TO DELETE :  ");	
			int empno = scan.nextInt();
			
			
	
			pst.setInt(1, empno);

			int rows = pst.executeUpdate();
			if(rows==0) {
				EmployeeNotFoundException ex = new EmployeeNotFoundException("Employee with this id does not exist!!! : "+empno);
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
class EmployeeNotFoundException extends RuntimeException
{
	EmployeeNotFoundException(String msg) {
		super(msg);
	}
}













