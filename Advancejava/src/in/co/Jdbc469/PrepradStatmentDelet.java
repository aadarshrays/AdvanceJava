package in.co.Jdbc469;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepradStatmentDelet {
	public static void main(String[] args) throws Exception {
		testdelete();
	}

	private static void testdelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays", "root", "root");
		PreparedStatement ps= con.prepareStatement("Delete From Employee Where Id=?");
		ps.setInt(1, 7);
		ps.executeUpdate();
		System.out.println("Delete");

		ps.close();
		con.close();
	}

}
