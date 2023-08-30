package com.ferenc.HotlineWebApp.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseController {

	private static String connection = "jdbc:postgresql://localhost:5432/hotlinedata?user=postgres&password=";
	private static String passWord = "Plutonium-36";
	
	private static Connection conn;
	private static PreparedStatement pst;
	
	
	public void getConnection() throws SQLException {
		
		try {
			conn = DriverManager.getConnection(connection+passWord);
			
		} catch (Exception e) {
			throw new SQLException("Sikertelen csatlakozás az adatbázishoz: "+e.getMessage());
		}
		
	}
	
	
	
}
