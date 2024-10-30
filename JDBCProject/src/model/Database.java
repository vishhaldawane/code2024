package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * 
 * The SUCCESS REQUIRES YOUR NEW YOU
 * 
 * PERSONAL VICTORY
 * 1. Be proactive
 * 2. Begin with the END in mind
 * 3. Put first thing First
 * 
 * 4. think Win-Win
 * 
 * PUBLIC VICTORY : relationship, job, social, friends, business, etc...
 * 5. Seek first to understand then to be understood
 * 6. SYNERGY
 * 7. Sharpen THE SAW
 * 
 */
public class Database {

	public static Connection getConnection() {
		
	
		//2. acquire the connection
		Connection conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded....");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql",
					"root","root123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected ..."+conn);
		return conn;
	}
	
}
