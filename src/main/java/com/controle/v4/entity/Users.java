package com.controle.v4.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String username;
	private String password;
	private int enabled;

	public Users() {
		super();
	}

	public Users(String username, String password, int enabled) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

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

	public int isEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", enabled=" + enabled + "]";
	}

}
