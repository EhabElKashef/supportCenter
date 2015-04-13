package com.trioPlus.supportCenter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="System_USER")
public class SystemUser {
	 @Id  
	 @SequenceGenerator(name="userSeq", sequenceName = "MGM_PROMOTER_SEQ")
	 @GeneratedValue(generator = "userSeq")	
 
	 private int id;  
	 public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFullUserName() {
		return fullUserName;
	}

	public void setFullUserName(String fullUserName) {
		this.fullUserName = fullUserName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="user_id")
	 private int user_id;
	 
	 @Column(name = "full_user_name")  
	 private String fullUserName;  
	  
	 @Column(name="email") 
	 private String email;
	 
	  
	 public int getId() {  
	  return id;  
	 }  
	  
	 public void setId(int id) {  
	  this.id = id;  
	 }  
	  
		 
}
