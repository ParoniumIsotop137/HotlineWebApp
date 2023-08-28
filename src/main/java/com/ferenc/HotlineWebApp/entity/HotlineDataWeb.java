package com.ferenc.HotlineWebApp.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.ferenc.hotlineapp.mainwindow.HotlineData;


public class HotlineDataWeb {
	
	private LocalDate date;
	private int sdNumber;
	private String openedFrom;
	private String technicianName;
	private String phoneNumber;
	private String localizationNumber;
	private int lineNumber;
	private String closedFrom;
	private boolean isClosed;
	
	
	public HotlineDataWeb() {
		
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate() {
		this.date = LocalDate.now();
	}

	public int getSdNumber() {
		return sdNumber;
	}

	public void setSdNumber(int sdNumber) {
		this.sdNumber = sdNumber;
	}

	public String getOpenedFrom() {
		return openedFrom;
	}

	public void setOpenedFrom(String openedFrom) {
		this.openedFrom = openedFrom;
	}

	public String getTechnicianName() {
		return technicianName;
	}

	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocalizationNumber() {
		return localizationNumber;
	}

	public void setLocalizationNumber(String localizationNumber) {
		this.localizationNumber = localizationNumber;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getClosedFrom() {
		return closedFrom;
	}

	public void setClosedFrom(String closedFrom) {
		this.closedFrom = closedFrom;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}

	

	@Override
	public String toString() {
		return "HotlineDataWeb [date=" + date + ", sdNumber=" + sdNumber + ", openedFrom=" + openedFrom
				+ ", technicianName=" + technicianName + ", phoneNumber=" + phoneNumber + ", localizationNumber="
				+ localizationNumber + ", lineNumber=" + lineNumber + ", closedFrom=" + closedFrom + ", isClosed="
				+ isClosed + "]";
	}
	
	
	
	

	
	
	
	

}
