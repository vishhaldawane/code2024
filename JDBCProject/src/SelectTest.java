import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

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
			Statement st= conn.createStatement();
			System.out.println("Statement created...");
			ResultSet rs = st.executeQuery("select * from customer");
			System.out.println("result set ...");
			
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int managerCode = rs.getInt(4);
				java.sql.Date doj = rs.getDate(5);
				int salary = rs.getInt(6);
				int comm = rs.getInt(7);
				int dno = rs.getInt(8);
				System.out.println("EMPNO : "+empno);
				System.out.println("ENAME : "+ename);
				System.out.println("JOB   : "+job);
				/*System.out.println("MGR   : "+managerCode);
				System.out.println("HIRING: "+doj);
				System.out.println("SAL   : "+salary);
				System.out.println("COMM  : "+comm);
				System.out.println("DNO   : "+dno);*/
				System.out.println("-----------------");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
