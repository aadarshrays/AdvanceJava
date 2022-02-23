package in.co.Jdbc469;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Getdatatable {
	
	public static void main(String[] args) throws Exception {
		testAdd();
	}
	
	 private static void testAdd() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays", "root", "root");
		Statement s =  (Statement) con.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM EMPLOYEE");
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		rs.close();
		s.close();
		con.close();
	 
	 }
}
