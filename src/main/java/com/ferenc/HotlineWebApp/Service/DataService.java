package com.ferenc.HotlineWebApp.Service;

import java.sql.SQLException;
import java.util.List;

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
	
	public List<HotlineDataWeb> showData(){
		try {
			return dbControl.getData();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
		
	}
	
	 public void updateData(HotlineDataWeb hotlineData) {
		 
		 try {
			 
			dbControl.updateData(hotlineData);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
}
