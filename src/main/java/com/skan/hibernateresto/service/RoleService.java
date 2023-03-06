package com.skan.hibernateresto.service;

import com.skan.hibernateresto.dao.RoleDao;
import com.skan.hibernateresto.entity.Role;

import jakarta.persistence.EntityManager;

public class RoleService implements IRoleService {
	
	private RoleDao roleDao;
	
	public RoleService(EntityManager em) {
		this.roleDao = new RoleDao(em);
	}

	public void save(Role role) {
		this.roleDao.save(role);
	}

	public Role update(Role role) {
		return this.roleDao.update(role);
	}

	public Role findById(long id) {
		return this.roleDao.findById(id);
	}

}
