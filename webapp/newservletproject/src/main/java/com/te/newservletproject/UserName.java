package com.te.newservletproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserName {
	@Id
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserName [username=" + username + ", password=" + password + "]";
	}

}
