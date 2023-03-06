package com.skan.hibernateresto.dao;

import org.springframework.stereotype.Repository;

import com.skan.hibernateresto.entity.Role;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;

@Repository
public class RoleDao implements IRoleDao {

	//private EntityManagerFactory emf = Persistence.createEntityManagerFactory("restomanager-unit");
		// private EntityManager em = emf.createEntityManager();
		
		@PersistenceContext
		private EntityManager em;
	
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
