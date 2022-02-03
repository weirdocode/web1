package com.spring.basic.model;

public class BirthVO {
	
	private String year;
	private String month;
	private String day;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		if(Integer.parseInt(month) < 10) {
			this.month = "0" + month;
			return;
		}
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		if(day.length() == 1) {
			this.day = "0" + day;
			return;
		}
		this.day = day;
	}
	
	

}









