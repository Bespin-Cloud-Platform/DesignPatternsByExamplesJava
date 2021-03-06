package com.caveofprogramming.designpatterns.demo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	private static Database instance = new Database();
	
	private Connection con;
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		return instance;
	}
	
	/*
	private static Database instanceOld;
	
	public static Database getInstanceOld() {
		if(instanceOld == null) {
			instanceOld = new Database();
		}
		
		return instanceOld;
	}
	*/
	
	/*
	 * Add whatever methods you like to your singleton class.
	 */

	public Connection getConnection() {
		return con;
	}

	public void connect() throws Exception {
		if (con != null)
			return;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new Exception("Driver not found");
		}

		String url = String.format("jdbc:mysql://localhost:%d/mysql", 3306);

		con = DriverManager.getConnection(url, "truong", "1234");
	}
	
	public void disconnect() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Can't close connection");
			}
		}
		
		con = null;
	}

}
