package com.skan.hibernateresto;

import com.skan.hibernateresto.constant.Profile;
import com.skan.hibernateresto.constant.Unit;
import com.skan.hibernateresto.entity.Recette;
import com.skan.hibernateresto.entity.Role;
import com.skan.hibernateresto.entity.RoleUser;
import com.skan.hibernateresto.entity.User;
import com.skan.hibernateresto.service.RecetteService;
import com.skan.hibernateresto.service.RoleService;
import com.skan.hibernateresto.service.RoleUserService;
import com.skan.hibernateresto.service.UserService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
	
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory( "restomanager-unit" );
	private final EntityManager em = emf.createEntityManager();
	
	private UserService userService;
	private RecetteService recetteService;
	private RoleService roleService;
	private RoleUserService roleUserService;

	public Application(
			UserService userService,
			RecetteService recetteService,
			RoleService roleService,
			RoleUserService roleUserService) {
		this.userService = userService;
		this.recetteService = recetteService;
		this.roleService = roleService;
		this.roleUserService = roleUserService;
	}
	
	public void process() {
	  
		userService = new UserService(em);
		roleService = new RoleService(em);
		roleUserService = new RoleUserService(em);
		recetteService = new RecetteService(em);
		
		// BEGIN TRANSACTION
		em.getTransaction().begin();
		
		// Save few users
		userService.save(new User("konge", "konde@skan.com") );
		userService.save( new User("pdaule", "paulde@skan.com") );

		// Save few receipts
		// recetteService.save( new Recette("Tarte à la banane") );
		// recetteService.save( new Recette("Tarte à la fraise", 25) );
		// recetteService.save( new Recette("Tarte à la pomme", 25, Unit.convertFromString("hour") ) );
		

		// Find user named 
		
		User userSelected = userService.findByUsername("kone");
		Role roleSelected = roleService.findById(1L);
		
		roleUserService.save(new RoleUser(roleSelected, userSelected));
		
		// roleUserService.save(new RoleUser());
		
		em.getTransaction().commit();
		em.close();

	}
	

}