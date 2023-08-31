package com.ferenc.HotlineWebApp.Service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.ferenc.HotlineWebApp.Dao.DatabaseController;
import com.ferenc.HotlineWebApp.entity.HotlineDataWeb;
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
	
	public void saveData(HotlineDataWeb data) {
		
		try {
			
			dbControl.insertData(data);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
