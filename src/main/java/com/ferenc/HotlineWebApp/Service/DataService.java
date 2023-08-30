package com.ferenc.HotlineWebApp.Service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.ferenc.HotlineWebApp.Dao.DatabaseController;
@Service
public class DataService {
	
	private DatabaseController dbControl =  new DatabaseController();;
	
	public DataService(){
		
			
			try {
				
				dbControl.getConnection();
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		
		
	}
	
	
}
