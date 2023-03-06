package com.skan.hibernateresto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skan.hibernateresto.dao.RoleUserDao;
import com.skan.hibernateresto.entity.RoleUser;

import jakarta.transaction.Transactional;

@Service
public class RoleUserService implements IRoleUserService {

	@Autowired
	private RoleUserDao roleUserDao;
	
	public RoleUserService() {}

	@Transactional
	public void save(RoleUser roleUser) {
		this.roleUserDao.save(roleUser);
	}

	@Transactional
	public RoleUser update(RoleUser roleUser) {
		return this.roleUserDao.update(roleUser);
	}

	public List<RoleUser> findAll() {
		return this.roleUserDao.findAll();
	}

}
