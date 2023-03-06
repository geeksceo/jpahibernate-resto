package com.skan.hibernateresto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skan.hibernateresto.dao.RoleUserDao;
import com.skan.hibernateresto.entity.RoleUser;

@Service
public class RoleUserService implements IRoleUserService {

	private RoleUserDao roleUserDao;
	
	public RoleUserService() {}
	
	@Autowired
	public RoleUserService(RoleUserDao roleUserDao) {
		this.roleUserDao = roleUserDao;
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
