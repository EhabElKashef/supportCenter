package com.trioPlus.supportCenter.entity;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * The persistent class for the project_status database table.
 * 
 */
@Entity
@Table(name="project_status")
@NamedQuery(name="ProjectStatus.findAll", query="SELECT p FROM ProjectStatus p")
public class ProjectStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="status_name")
	@NotEmpty
	
	private String statusName;

	public ProjectStatus() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}