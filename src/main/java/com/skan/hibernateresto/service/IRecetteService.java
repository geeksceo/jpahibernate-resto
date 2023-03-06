package com.skan.hibernateresto.service;

import java.util.List;

import com.skan.hibernateresto.entity.Recette;

public interface IRecetteService {

	// Must call persist method whose return void
	public void save(Recette recette);
	
	public Recette findById(long id);
	
	public Recette findByName(String name);
	
	public List<Recette>  findByDuration(int duration);
	
	// Must call merge method
	public Recette update(Recette recette);
}
