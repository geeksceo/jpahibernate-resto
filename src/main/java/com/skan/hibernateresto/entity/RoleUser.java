package com.skan.hibernateresto.entity;

import java.io.Serializable;

import com.skan.hibernateresto.key.RoleUserKey;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "role_users")
public class RoleUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RoleUserKey id = new RoleUserKey();
	
	@ManyToOne
	@JoinColumn(name = "role_id", insertable=false, updatable=false, nullable=false)
	private Role role;
	
	@ManyToOne
	@JoinColumn(name = "user_id", insertable=false, updatable=false, nullable=false)
	private User user;
	
	public RoleUser() {}
	
	public RoleUser(Role role, User user) {
		this.role = role;
		this.user = user;
		
		this.id.setRole(role.getId());
		this.id.setUser(user.getId());
	}
	
	
	
}
