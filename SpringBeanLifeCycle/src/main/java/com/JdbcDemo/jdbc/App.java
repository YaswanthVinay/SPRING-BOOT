package com.JdbcDemo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class App {

	public String Driver;

	private String url;
	private String username;
	private String password;
	Connection con;

	public void setCon(Connection con) {
		System.out.println("in setCon");
		this.con = con;
	}

	public void setDriver(String driver) {
		System.out.println("in setDriver");
		Driver = driver;
	}

	public void setUrl(String url) {
		System.out.println("in  setUrl");
		this.url = url;
	}

	public void setUsername(String username) {
		System.out.println("in setUsername");
		this.username = username;
	}

	public void setPassword(String password) {
		System.out.println("in setPassword");
		this.password = password;
	}
	@PostConstruct
	public void create() throws ClassNotFoundException, SQLException {
		Class.forName(Driver);

		con = DriverManager.getConnection(url, username, password);

	}

	
	public void method1() throws ClassNotFoundException, SQLException {
		//create();

		String s = ("SELECT * FROM `employee`");
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(s);

		while (rs.next()) {
			System.out.println("------------      " + rs.getInt(1) + "              " + rs.getString(2) + "            "
					+ rs.getString(3) + "    ------");

		}

	}

	public void Delete() throws ClassNotFoundException, SQLException {
		
		String sql = "DELETE FROM employee   WHERE id=449";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);

		System.out.println("row deleted");
	}

	@PreDestroy
	public void Close() throws SQLException {
		System.out.println("inside destroy method");
		con.close();
	}
}
