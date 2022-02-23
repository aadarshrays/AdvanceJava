package in.co.Jdbc469;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrepradStatmenrttable {
	public static void main(String[] args) throws Exception {
		testadd();
	}

	private static void testadd() throws Exception  {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays", "root", "root");
	PreparedStatement ps= con.prepareStatement("Select * From Employee");
	ResultSet rs =ps.executeQuery();
	while (rs.next()) {
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getString(4));
		
	}
	rs.close();
	}

}
