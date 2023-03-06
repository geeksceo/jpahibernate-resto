package com.skan.hibernateresto.dao;

import com.skan.hibernateresto.entity.Role;

import jakarta.persistence.EntityManager;

public class RoleDao implements IRoleDao {

	private EntityManager em;
		
	public RoleDao(EntityManager em) {
		this.em = em;
	}
	
	public void save(Role role) {
		this.em.persist(role);
	}

	public Role update(Role role) {
		return this.em.merge(role);
	}

	public Role findById(long id) {
		return this.em.find(Role.class, id);
	}
	
}
