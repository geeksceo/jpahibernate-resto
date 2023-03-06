package com.skan.hibernateresto.service;

import java.util.List;

import com.skan.hibernateresto.entity.User;

public interface IUserService {

	// Must call persist method whose return void
		void save(User user) throws Exception;
		
		User findById(long id);
		
		List<User> findAll();
		
		User findByUsername(String username);
		
		User findByEmail(String email);
		
		// Must call merge method
		User update(User user);

}
