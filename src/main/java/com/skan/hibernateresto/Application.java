package com.skan.hibernateresto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.skan.hibernateresto.constant.Unit;
import com.skan.hibernateresto.entity.Recette;
import com.skan.hibernateresto.entity.Role;
import com.skan.hibernateresto.entity.RoleUser;
import com.skan.hibernateresto.entity.User;
import com.skan.hibernateresto.service.RecetteService;
import com.skan.hibernateresto.service.RoleService;
import com.skan.hibernateresto.service.RoleUserService;
import com.skan.hibernateresto.service.UserService;

@Component
public class Application {

	private UserService userService;
	private RecetteService recetteService;
	private RoleService roleService;
	private RoleUserService roleUserService;
		
	public Application() {
		System.out.println("Application constructor 0");
	}
	
	@Autowired
	public Application(UserService userService,
			RecetteService recetteService,
			RoleService roleService,
			RoleUserService roleUserService) {
		System.out.println("Application constructor 1");
	}

	public void process() {
		// Save few users
		
		this.userService.save(new User("eeee", "eeekonde@skan.com") );
	}
	

}