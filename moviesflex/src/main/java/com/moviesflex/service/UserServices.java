package com.moviesflex.service;

import java.util.List;


import com.moviesflex.entity.User;

public interface UserServices {
	
	public String userCreate(User user);
	
	public boolean exitEmail(String email);
	
	public boolean userCheck(String email, String password);
	
	public List<User> viewUser();

	public User getUser(String email);

	public void updateUser(User user);
	
	
	

}
