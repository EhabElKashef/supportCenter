package com.trioPlus.supportCenter.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Report.findAll", query="SELECT r FROM Report r")

public class Report {
	@Id
private int id;
	@Column(name="project_id")
private int projectId;
	@Column(name="sr_engineer_id")
private int srEngineerId;
	@Column(name="sr_highlights")
private String srHighLights;
	@Column(name="sr_comments")
private String srComments;
	@Column(name="sr_issues")
private String srIssue;
	@Column(name="sr_risk")
	private String srRisk;
	@Column(name="sr_startDate")
	private Date srStartDate;
	@Column(name="sr_endDate")
	private Date srEndDate;
	public String getSrRisk() {
		return srRisk;
	}
	public void setSrRisk(String srRisk) {
		this.srRisk = srRisk;
	}
	public Date getSrStartDate() {
		return srStartDate;
	}
	public void setSrStartDate(Date srStartDate) {
		this.srStartDate = srStartDate;
	}
	public Date getSrEndDate() {
		return srEndDate;
	}
	public void setSrEndDate(Date srEndDate) {
		this.srEndDate = srEndDate;
	}
	public int getActualEffort() {
		return actualEffort;
	}
	public void setActualEffort(int actualEffort) {
		this.actualEffort = actualEffort;
	}
	@Column(name="actual_effort")
	private int actualEffort;
	
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getProjectId() {
	return projectId;
}
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
public int getSrEngineerId() {
	return srEngineerId;
}
public void setSrEngineerId(int srEngineerId) {
	this.srEngineerId = srEngineerId;
}
public String getSrHighLights() {
	return srHighLights;
}
public void setSrHighLights(String srHighLights) {
	this.srHighLights = srHighLights;
}
public String getSrComments() {
	return srComments;
}
public void setSrComments(String srComments) {
	this.srComments = srComments;
}
public String getSrIssue() {
	return srIssue;
}
public void setSrIssue(String srIssue) {
	this.srIssue = srIssue;
}
}
