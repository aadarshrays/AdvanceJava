package com.Marksheetmodel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarksheetModal {
	private static final MarksheetBean Bean = null;

	public void ADD(MarksheetBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("INSERT INTO MARKSHEET1 VALUES(?,?,?,?,?,?)");
		ps.setInt(1, autoId() + 1);
		ps.setString(2, bean.getRollno());
		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		ps.executeUpdate();
		conn.commit();
		System.out.println("Inserted");
		ps.close();
		conn.close();
		
	//	JdbcDataSource.closeConnection(conn,ps);
	
	}

	public int autoId() throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement cal = conn.prepareStatement("select max(ID)from MARKSHEET1");

		ResultSet rs = cal.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		return count + 1;
	}

	public void update(MarksheetBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("UPDATE MARKSHEET1 SET ROLLNO=? WHERE ID=?");
		ps.setString(1, bean.getRollno());
		ps.setInt(2, bean.getId());
		ps.executeUpdate();
		conn.commit();
		System.out.println("Record Updated");
		JdbcDataSource.closeConnection(conn, ps);
	}

	public void delete(MarksheetBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("DELETE FROM MARKSHEET1 WHERE ROLLNO=?");
		ps.setString(1, bean.getRollno());
		ps.executeUpdate();
		conn.commit();
		System.out.println("deleted");
		JdbcDataSource.closeConnection(conn, ps);
	}

	public void get(MarksheetBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM MARKSHEET1 WHERE ROLLNO=?");
		ps.setString(1, bean.getRollno());
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			System.out.print(rs.getString(5) + "\t");
			System.out.print(rs.getString(6) + "\t");
			System.out.println(rs.getString(7) + "\t");
		}
		conn.commit();
		JdbcDataSource.closeConnection(conn, ps);

	}

	public void getMeritList() throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement(
				"SELECT * FROM Marksheet1  WHERE phy>40 AND maths>40 AND che>40 ORDER BY (phy + maths + che) DESC LIMIT 3;");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			System.out.print(rs.getString(5) + "\t");
			System.out.print(rs.getString(6) + "\t");
			System.out.println(rs.getString(7) + "\t");
		}
		JdbcDataSource.closeConnection(conn, ps);

	}

	public void search(MarksheetBean bean) throws Exception {

		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("Select * from Marksheet1 where FNAME = ?");
		ps.setString(1, bean.getName());
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			System.out.print(rs.getString(5) + "\t");
			System.out.print(rs.getString(6) + "\t");
			System.out.println(rs.getString(7) + "\t");
		}

		JdbcDataSource.closeConnection(conn, ps);

	}

	public void list() throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("Select * from Marksheet1 ");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			System.out.print(rs.getString(5) + "\t");
			System.out.print(rs.getString(6) + "\t");
			System.out.println(rs.getString(7) + "\t");
		}

		JdbcDataSource.closeConnection(conn, ps, rs);
	}

}
