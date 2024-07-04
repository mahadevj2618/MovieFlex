package com.moviesflex.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.moviesflex.entity.User;
import com.moviesflex.repository.UserRepository;

@Service
public class UserServicesImplementation implements UserServices{

	@Autowired
	UserRepository usrepo;
	public UserServicesImplementation(UserRepository usrepo) {
		super();
		this.usrepo = usrepo;
	}

	@Override
	public String userCreate(User user) {
		usrepo.save(user);
		return "create object";
	}

	@Override
	public boolean exitEmail(String email) {
		User user=usrepo.findByEmail(email);
		
		return user !=null;
	}

	@Override
	public boolean userCheck(String email, String password) {
		User usr=usrepo.findByEmail(email);
		String db=usr.getPassword();
		if(db.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}


	@Override
	public List<User> viewUser() {
		List<User> userlist=usrepo.findAll();
		return userlist;
	}

	@Override
	public User getUser(String email) {
		User user=usrepo.findByEmail(email);
		return user;
	}

	@Override
	public void updateUser(User user) {
		usrepo.save(user);
		
	}

	
	
}
