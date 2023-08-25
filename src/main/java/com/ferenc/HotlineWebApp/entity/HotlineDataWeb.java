package com.ferenc.HotlineWebApp.entity;

import java.time.LocalDate;

import com.ferenc.hotlineapp.mainwindow.HotlineData;

public class HotlineDataWeb extends HotlineData{
	
	private boolean isClosed;

	public HotlineDataWeb(LocalDate date, int sdNumber, String openedFrom, String technicianName, String phoneNumber,
			String localizationNumber, int lineNumber, String closedFrom, boolean isClosed) {
		super(date, sdNumber, openedFrom, technicianName, phoneNumber, localizationNumber, lineNumber, closedFrom);
		this.isClosed = isClosed;
	}

	@Override
	public String toString() {
		return super.toString()+", isClosed=" + ((this.isClosed)?"Lezárt":"Nyitott");
	}
	
	
	
	

}
