package com.Marksheetmodel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {
	private static JdbcDataSource jds = null;
	private ComboPooledDataSource ds = null;

	private JdbcDataSource() {
		ResourceBundle rb = ResourceBundle.getBundle("com.Marksheetmodel.app");
		try {
			ds = new ComboPooledDataSource();
			ds.setDriverClass(rb.getString("Driver"));
			ds.setJdbcUrl(rb.getString("url"));
			ds.setUser(rb.getString("username"));
			ds.setPassword(rb.getString("password"));
			ds.setInitialPoolSize(10);
			ds.setAcquireIncrement(10);
			ds.setMaxPoolSize(100);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static JdbcDataSource getInstance() {

		if (jds == null) {
			jds = new JdbcDataSource();
		}
		return jds;

	}

	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();

		} catch (SQLException e) {
			return null;
		}

	}

	public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void closeConnection(Connection conn) {
		closeConnection(conn, null, null);

	}

	public static void closeConnection(Connection conn, PreparedStatement ps) throws Exception {
		conn.close();
		ps.close();

	}

}