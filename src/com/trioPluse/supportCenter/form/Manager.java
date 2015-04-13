package com.trioPluse.supportCenter.form;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;


/**
 * The persistent class for the manager database table.
 * 
 */
public class Manager implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String name;
	
	 private int user_id;
	 
	 private String userType;  
	 private String username;
	 private String email;
	 private List<String> roles;

//	//bi-directional many-to-one association to Project
//	@OneToMany(mappedBy="manager")
//	private List<Project> projects;

	public Manager() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", user_id=" + user_id
				+ ", userType=" + userType + ", email=" + email + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
//	public List<Project> getProjects() {
//		return this.projects;
//	}
//
//	public void setProjects(List<Project> projects) {
//		this.projects = projects;
//	}
//
//	public Project addProject(Project project) {
//		getProjects().add(project);
//		project.setManager(this);
//
//		return project;
//	}
//
//	public Project removeProject(Project project) {
//		getProjects().remove(project);
//		project.setManager(null);
//
//		return project;
//	}

}