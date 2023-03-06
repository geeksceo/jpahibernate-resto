package com.skan.hibernateresto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skan.hibernateresto.dao.RoleDao;
import com.skan.hibernateresto.entity.Role;

import jakarta.transaction.Transactional;

@Service
public class RoleService implements IRoleService {
	
	@Autowired
	private RoleDao roleDao;
	
	public RoleService() {}
	
	@Transactional
	public void save(Role role) {
		this.roleDao.save(role);
	}
	
	@Transactional
	public Role update(Role role) {
		return this.roleDao.update(role);
	}

	public Role findById(long id) {
		return this.roleDao.findById(id);
	}

}
