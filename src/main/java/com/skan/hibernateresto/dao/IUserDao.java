package com.skan.hibernateresto.dao;

import com.skan.hibernateresto.entity.User;

public interface IUserDao {

	// Must call persist method whose return void
	public void save(User user);
	
	public User findById(long id);
	
	public User findByUsername(String username);
	
	public User findByEmail(String email);
	
	// Must call merge method
	public User update(User user);
}
