package com.spring.basic.model;

import java.util.List;

public class UserVO {
	
	//VO 클래스의 멤버변수명과 파라미터변수명이 정확하게 일치해야 
	//커맨드 객체가 정상적으로 동작합니다.
	private String userId;
	private String userPw;
	private String userName;
	private List<String> hobby;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	
	

}
