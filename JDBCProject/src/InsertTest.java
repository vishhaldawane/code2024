import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;

public class InsertTest {

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
			PreparedStatement pst= conn.prepareStatement("insert into emp values (?,?,?,?,?,?,?,?)");
			System.out.println("PreparedStatement created...");
					
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter EMPNO : ");	
			int empno = scan.nextInt();
					
			System.out.println("Enter ENAME : ");	
			String ename = scan.next();
			
			System.out.println("Enter JOB   : ");	
			String job =  scan.next();
			
			System.out.println("Enter MGR   : ");	
			int managerCode = scan.nextInt();
			
			System.out.println("Enter HIRING: ");	
			String dateInString = scan.next();
			java.sql.Date date=java.sql.Date.valueOf(dateInString);//converting string into sql date.
			
			
			System.out.println("Enter SAL   : ");	
			int salary = scan.nextInt();
			
			System.out.println("Enter COMM  : ");	
			int comm = scan.nextInt();
			
			System.out.println("Enter DNO   : ");	
			int dno = scan.nextInt();
				
			pst.setInt(1, empno);
			pst.setString(2, ename);
			pst.setString(3, job);
			pst.setInt(4, managerCode);
			pst.setDate(5, date);
			pst.setInt(6, salary);
			pst.setInt(7, comm);
			pst.setInt(8, dno);
			
			pst.executeUpdate();
			System.out.println("Insert Query fired... ");
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
