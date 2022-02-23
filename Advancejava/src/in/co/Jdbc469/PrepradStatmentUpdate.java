package in.co.Jdbc469;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepradStatmentUpdate {
	public static void main(String[] args) throws Exception {
		testUpdate();
	}

	private static void testUpdate() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays", "root", "root");
		int id = 4;
		String fname="Avinash";
		PreparedStatement ps= con.prepareStatement("Update Employee Set Fname=? where id =?");
		ps.setInt(1, 4);
		ps.executeUpdate();
		System.out.println("Update");

		ps.close();
		con.close();
	}

}


}
