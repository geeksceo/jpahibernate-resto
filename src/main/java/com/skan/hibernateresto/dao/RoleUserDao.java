package com.skan.hibernateresto.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.skan.hibernateresto.entity.RoleUser;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

@Repository
public class RoleUserDao implements IRoleUserDao {

	private EntityManagerFactory emf;
	private EntityManager em;

	public RoleUserDao() {
		this.emf = Persistence.createEntityManagerFactory( "restomanager-unit" );
		this.em =  emf.createEntityManager();
	}
	
	public void save(RoleUser roleUser) {
		this.em.getTransaction().begin();
		
		this.em.persist(roleUser);
		
		this.em.getTransaction().commit();
		this.em.close();
	}

	public RoleUser update(RoleUser roleUser) {
		return this.em.merge(roleUser);
	}

	public List<RoleUser> findAll() {
		TypedQuery<RoleUser> query = em.createQuery("SELECT ru FROM RoleUser ru", RoleUser.class);
		return query.getResultList();
	}

}
