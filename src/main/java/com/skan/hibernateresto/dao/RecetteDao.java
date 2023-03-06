package com.skan.hibernateresto.dao;

import java.util.List;

import com.skan.hibernateresto.entity.Recette;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class RecetteDao implements IRecetteDao {

	private EntityManager em;
	
	public RecetteDao(EntityManager em) {
		this.em = em;
	}
	
	public void save(Recette recette) {
		this.em.persist(recette);
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
