package com.trioPluse.supportCenter.form;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * The persistent class for the project_status database table.
 * 
 */
public class ProjectStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

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

	@Override
	public String toString() {
		return statusName ;
	}

}