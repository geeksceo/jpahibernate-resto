package com.skan.hibernateresto.dao;

import com.skan.hibernateresto.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class UserDao implements IUserDao {

	private EntityManager em;
	
	public UserDao(EntityManager em) {
		this.em = em;
	}

	public void save(User user) {
		this.em.persist(user);
	}

	public User findById(long id) {
		return this.em.find(User.class, id);
	}

	public User update(User user) {
		return this.em.merge(user);
	}

	public User findByUsername(String username) {
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE username LIKE :username", User.class);
		query.setParameter("username", username);
		User result = null;
		return query.getSingleResult();
	}

	public User findByEmail(String email) {
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE email LIKE :email", User.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}

}
