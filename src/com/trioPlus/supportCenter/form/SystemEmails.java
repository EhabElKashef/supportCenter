package com.trioPlus.supportCenter.form;

// default package
// Generated Jan 10, 2015 1:07:11 PM by Hibernate Tools 3.4.0.CR1

/**
 * SystemEmails generated by hbm2java
 */
public class SystemEmails implements java.io.Serializable {

	private Integer id;
	private Integer userId;
	private String email;

	public SystemEmails() {
	}

	public SystemEmails(Integer userId, String email) {
		this.userId = userId;
		this.email = email;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
