package in.co.StoredProcedure487;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class PreparecallDelete {
	public static void main(String[] args) {
		testdelete();
	}

	private static void testdelete() {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	CallableStatement callst = con.prepareCall("{?=CALL userfunction()}");
	callst.registerOutParameter(1, Types.INTEGER);
	//callst.setString(2, "Vijay");
	//callst.setInt(3, 100);
	callst.execute();
	int count = callst.getInt(1);
	System.out.println("Count " + callst.getInt(1));

}

}

		
	}

}
