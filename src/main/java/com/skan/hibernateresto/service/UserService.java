package com.skan.hibernateresto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skan.hibernateresto.dao.UserDao;
import com.skan.hibernateresto.entity.User;

import jakarta.transaction.Transactional;
 
@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void save(User user) {
		if( this.findByEmail(user.getEmail()) == null 
			|| this.findByUsername(user.getUsername()) == null) {
			
			try {
				this.userDao.save(user);			
			} catch(Exception e) {
				System.out.println("Exception is occured on saving new User");
			}
		}	
	}

	public User findById(long id) {
		return this.userDao.findById(id);
	}

	public User findByUsername(String username) {
		User result = null;
		try {
			result = this.userDao.findByUsername(username);
		} catch(Exception e) {
			System.out.println("No entry for this user with username : " + username);
			return null;
		}
		return result;
	}

	public User findByEmail(String email) {
		User result = null;
		try {
			result = this.userDao.findByEmail(email);
		} catch(Exception e) {
			return null;
		}
		return result;
	}

	@Transactional
	public User update(User user) {
		return this.userDao.update(user);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
