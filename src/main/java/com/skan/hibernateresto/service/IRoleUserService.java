package com.skan.hibernateresto.service;

import java.util.List;

import com.skan.hibernateresto.entity.RoleUser;

public interface IRoleUserService {

	public void save(RoleUser roleUser);
	
	public RoleUser update(RoleUser roleUser);
	
	public List<RoleUser> findAll();
	
}
