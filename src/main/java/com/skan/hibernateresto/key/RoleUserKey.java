package com.skan.hibernateresto.key;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class RoleUserKey implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "role_id")
	protected long role;
	
	@Column(name = "user_id")
	protected long user;
		
	
	public RoleUserKey() {}
	
	public RoleUserKey(long role, long user) {
		this.role = role;
		this.user = user;
	}

	public long getUser() {
		return user;
	}

	public void setUser(long user) {
		this.user = user;
	}

	public long getRole() {
		return role;
	}

	public void setRole(long role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (role ^ (role >>> 32));
		result = prime * result + (int) (user ^ (user >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleUserKey other = (RoleUserKey) obj;
		if (role != other.role)
			return false;
		if (user != other.user)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RoleUserKey [role=" + role + ", user=" + user + "]";
	}


	
	
}
