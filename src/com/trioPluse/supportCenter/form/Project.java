package com.trioPluse.supportCenter.form;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the project database table.
 * 
 */

public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private Date endDate;

	
	private int estimatedTime;

	
	private String projectName;

	
	private int projectStatusId;

	private Date startDate;

	//bi-directional many-to-one association to Manager
	private int managerId;

	private List<Integer> stakeholders;

	public Project() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getEstimatedTime() {
		return this.estimatedTime;
	}

	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectStatusId() {
		return this.projectStatusId;
	}

	public void setProjectStatusId(int projectStatusId) {
		this.projectStatusId = projectStatusId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	
	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public List<Integer> getStakeholders() {
		return this.stakeholders;
	}

	public void setStakeholders(List<Integer> stakeholders) {
		this.stakeholders = stakeholders;
	}

}