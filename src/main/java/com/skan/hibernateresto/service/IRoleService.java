package com.skan.hibernateresto.service;

import com.skan.hibernateresto.entity.Role;

public interface IRoleService {

	public void save(Role role);
	
	public Role update(Role role);
	
	public Role findById(long id);
	
}
