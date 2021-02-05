package com.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	private static Connection connection;
	
	private DbConnection() {
		
	}
	
	public static Connection getConnection() {
		
		if(connection==null) {
			try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise-db","root","");
			}catch(Exception ex) {
				System.out.println(ex);
			}
		}
	return connection;
	}
	
}
