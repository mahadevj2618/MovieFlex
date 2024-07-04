package com.moviesflex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviesflex.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByEmail(String email);

}
