package com.skan.hibernateresto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

	@Autowired
	private UserService userService;
	@Autowired
	private RecetteService recetteService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private RoleUserService roleUserService;
		
	public void process() {
		// Save few users
		
		this.userService.save(new User("geeksceo", "oowashina@skan.com") );
		this.userService.save( new User("tanfolo", "tanfolo@skan.com") );

		// Save few receipts
		this.recetteService.save( new Recette("Tarte à la banane") );
		this.recetteService.save( new Recette("Tarte à la fraise", 25) );
		this.recetteService.save( new Recette("Tarte à la pomme", 25, Unit.convertFromString("hour") ) );
				

		// Find user named 
				
		// User userSelected = userService.findByUsername("kone");
		// Role roleSelected = roleService.findById(1L);
				
		// roleUserService.save(new RoleUser(roleSelected, userSelected));
	}
	

}