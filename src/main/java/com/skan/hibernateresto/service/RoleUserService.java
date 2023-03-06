package com.skan.hibernateresto.service;

import java.util.List;

import com.skan.hibernateresto.dao.RoleUserDao;
import com.skan.hibernateresto.entity.RoleUser;

import jakarta.persistence.EntityManager;

public class RoleUserService implements IRoleUserService {

	private final RoleUserDao roleUserDao;
	
	public RoleUserService(EntityManager em) {
		this.roleUserDao = new RoleUserDao(em);
	}
	
	public void save(RoleUser roleUser) {
		this.roleUserDao.save(roleUser);
	}

	public RoleUser update(RoleUser roleUser) {
		return this.roleUserDao.update(roleUser);
	}

	public List<RoleUser> findAll() {
		return this.roleUserDao.findAll();
	}

}
