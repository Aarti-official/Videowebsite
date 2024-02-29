package com.example.daoImplementation;

import com.example.entity.User;

public interface UserDao {

	public User loginUser(String email, String password);
	
	public int  registerUser(String name,String email, String password,int number);
}
