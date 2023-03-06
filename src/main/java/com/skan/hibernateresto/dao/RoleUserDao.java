package com.skan.hibernateresto.dao;

import java.util.List;

import com.skan.hibernateresto.entity.RoleUser;
import com.skan.hibernateresto.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class RoleUserDao implements IRoleUserDao {

	private EntityManager em;
	
	public RoleUserDao() {}
	
	public RoleUserDao(EntityManager em) {
		this.em = em;
	}
	
	public void save(RoleUser roleUser) {
		this.em.persist(roleUser);
	}

	public RoleUser update(RoleUser roleUser) {
		return this.em.merge(roleUser);
	}

	public List<RoleUser> findAll() {
		TypedQuery<RoleUser> query = em.createQuery("SELECT ru FROM RoleUser ru", RoleUser.class);
		return query.getResultList();
	}

}
