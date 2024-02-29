package com.example.entity;
public class User {
		
	private	String name;
	private String email;
	private String number;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String name, String email, String number, String password) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.password = password;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", number=" + number + ", password=" + password + "]";
	}
	
	
}
