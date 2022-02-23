package in.co.Jdbc469;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class GetdataUpdate {
	public static void main(String[] args) throws Exception {
//		testupdate();
		testDelete();
		
	}

	private static void testupdate() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays", "root", "root");
		Statement s =  (Statement) con.createStatement();
		s.executeUpdate("update Employee Set Fname='ankit', Lname='Lacheta' Where id =1");
		System.out.println("Update");
	
		s.close();
		con.close();
	 
	 }
	


	private static void testDelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays", "root", "root");
		Statement s =  (Statement) con.createStatement();
		s.executeUpdate("Delete From Employee Where id =8");
		System.out.println("Delete");
	
		s.close();
		con.close();
	 
	 }
	

	}


