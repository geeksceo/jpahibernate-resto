package com.skan.hibernateresto.dao;

import com.skan.hibernateresto.entity.Role;

public interface IRoleDao {

	public void save(Role role);
	
	public Role update(Role role);
	
	public Role findById(long id);
	
}
