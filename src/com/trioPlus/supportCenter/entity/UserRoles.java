package com.trioPlus.supportCenter.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_roles")
public class UserRoles {
public UserRoles(int user_id, String authority) {
		super();
		this.user_id = user_id;
		this.authority = authority;
	}
@Id
private int id;
private int user_id;
private String authority;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getAuthority() {
	return authority;
}
public void setAuthority(String authority) {
	this.authority = authority;
}
}
