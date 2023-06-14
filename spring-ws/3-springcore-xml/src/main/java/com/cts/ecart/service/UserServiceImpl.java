package com.cts.ecart.service;

public class UserServiceImpl {
	
	private String userName;
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void display() {
		System.out.println("User name is "+userName);
	}
	
	public UserServiceImpl() {
		System.out.println(">>>>UserServiceImpl object created..");
	}

}
