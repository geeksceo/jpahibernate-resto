package com.skan.hibernateresto.dao;

import java.util.List;

import com.skan.hibernateresto.entity.RoleUser;

public interface IRoleUserDao {

	public void save(RoleUser roleUser);
	
	public RoleUser update(RoleUser roleUser);
	
	public List<RoleUser> findAll();
	
}
