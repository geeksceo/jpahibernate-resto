package com.skan.hibernateresto.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.skan.hibernateresto.entity.Recette;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

@Repository
public class RecetteDao implements IRecetteDao {

	private EntityManagerFactory emf;
	private EntityManager em;
	
	public RecetteDao() {
		this.emf = Persistence.createEntityManagerFactory( "restomanager-unit" );
		this.em =  emf.createEntityManager();
	}
	
	public void save(Recette recette) {
		this.em.getTransaction().begin();
		
		this.em.persist(recette);
		
		this.em.getTransaction().commit();
		this.em.close();
	}

	public Recette findById(long id) {
		return this.em.find(Recette.class, id);
	}

	public Recette findByName(String name) {
		TypedQuery<Recette> query = em.createQuery("SELECT r FROM Recette r WHERE name LIKE :name", Recette.class);
		query.setParameter("name", name);
		return query.getSingleResult();
	}

	public List<Recette> findByDuration(int duration) {
		TypedQuery<Recette> query = em.createQuery("SELECT r FROM Recette r WHERE duration = :name", Recette.class);
		query.setParameter("duration", duration);
		return query.getResultList();
	}

	public Recette update(Recette recette) {
		return this.em.merge(recette);
	}

}
