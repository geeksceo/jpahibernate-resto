package com.skan.hibernateresto.service;

import java.util.List;

import com.skan.hibernateresto.dao.RecetteDao;
import com.skan.hibernateresto.entity.Recette;

import jakarta.persistence.EntityManager;

public class RecetteService implements IRecetteService {
	
	private RecetteDao recetteDao;
	
	public RecetteService(EntityManager em) {
		this.recetteDao = new RecetteDao(em);
	}

	public void save(Recette recette) {
		this.recetteDao.save(recette);
	}

	public Recette findById(long id) {
		return this.recetteDao.findById(id);
	}

	public Recette findByName(String name) {
		return this.recetteDao.findByName(name);
	}

	public List<Recette> findByDuration(int duration) {
		return this.recetteDao.findByDuration(duration);
	}

	public Recette update(Recette recette) {
		return this.recetteDao.update(recette);
	}

}
