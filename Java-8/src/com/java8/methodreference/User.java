package com.java8.methodreference;

public class User {

	private boolean isValidUser;
	private String userName;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isValidUser() {
		return isValidUser;
	}

	public void setValidUser(boolean isValidUser) {
		this.isValidUser = isValidUser;
	}

	public User(boolean validUser, String userName) {
		this.isValidUser = validUser;
		this.userName = userName;
	}
	
	public User() {
	}
	
	public static boolean isRealUserStaticMethod(User u) {
		return u.isValidUser;
	}
	
	public boolean isRealUserInstanceMethod(User u) {
		return u.isValidUser;
	}
	
}
