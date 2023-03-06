package com.skan.hibernateresto.dao;

import org.springframework.stereotype.Repository;

import com.skan.hibernateresto.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

@Repository
public class UserDao implements IUserDao {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public UserDao() {
		this.emf = Persistence.createEntityManagerFactory( "restomanager-unit" );
		this.em =  emf.createEntityManager();
	}

	public void save(User user) {
		this.em.getTransaction().begin();
		
		this.em.persist(user);
		
		this.em.getTransaction().commit();
		this.em.close();
	}

	public User findById(long id) {
		return this.em.find(User.class, id);
	}

	public User update(User user) {
		this.em.getTransaction().begin();
		
		User updated = this.em.merge(user);
		
		this.em.getTransaction().commit();
		this.em.close();
		
		return updated;
	}

	public User findByUsername(String username) {
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE username LIKE :username", User.class);
		query.setParameter("username", username);
		return query.getSingleResult();
	}

	public User findByEmail(String email) {
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE email LIKE :email", User.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}

}
