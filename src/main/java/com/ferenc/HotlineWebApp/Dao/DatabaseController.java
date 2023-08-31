package com.ferenc.HotlineWebApp.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ferenc.HotlineWebApp.entity.HotlineDataWeb;

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
	
	public void insertData(HotlineDataWeb data) throws SQLException {
		
		
		try {
			
			pst = conn.prepareStatement("Insert into calldata (datum, jegyszam, jegyet_nyitotta, technikus_neve, telefonszama, standort, linie, jegyet_zarta, visszahivott) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			pst.setDate(1, Date.valueOf(data.getDate()));
			pst.setInt(2, data.getSdNumber());
			pst.setString(3, data.getOpenedFrom());
			pst.setString(4, data.getTechnicianName());
			pst.setString(5, data.getPhoneNumber());
			pst.setString(6, data.getLocalizationNumber());
			pst.setInt(7, data.getLineNumber());
			pst.setString(8, data.getClosedFrom());
			pst.setBoolean(9, data.isClosed());
			
			pst.executeUpdate();
			
			pst.clearParameters();
			
		} catch (SQLException e) {
			throw new SQLException("Hiba az adatok mentésekor: "+e.getMessage());
		}
		
	}
	
	public List<HotlineDataWeb> getData() throws SQLException{
		
		List<HotlineDataWeb> dataList = new ArrayList<HotlineDataWeb>();
		
		
		try {
			
			pst = conn.prepareStatement("Select * from calldata");
			
			ResultSet res = pst.executeQuery();
			
			if(res.next()) {
				
				dataList.add(new HotlineDataWeb((res.getDate("datum").toLocalDate()), res.getInt("jegyszam"), res.getString("jegyet_nyitotta"), res.getString("technikus_neve"), res.getString("telefonszama"), res.getString("standort"), res.getInt("linie"), res.getString("jegyet_zarta"), res.getBoolean("visszahivott")));
				
			}
			
		} catch (SQLException e) {
			throw new SQLException("Hiba az adatok betöltésekor: "+e.getMessage());
		}
		
		return dataList;
		
		
	}
	
	
	
}
