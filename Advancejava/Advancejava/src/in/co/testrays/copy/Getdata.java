package in.co.testrays.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Getdata { 
	public static void main(String[] args) throws Exception {
Class.forName("com.mysql.jdbc.Driver");
Connection conn=
DriverManager.getConnection("jdbc:mysql://localhost:3306/testrays","root","root");
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery("SELECT i,Fname,salary FROM EMPLOYEE");
while (rs.next()) {
System.out.println(rs.getString(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
}

st.close();
conn.close();

}
}