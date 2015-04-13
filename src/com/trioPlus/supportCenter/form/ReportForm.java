package com.trioPlus.supportCenter.form;

import java.util.Date;

import javax.persistence.Column;

public class ReportForm {
	private int id;
	private int projectId;
	private int srEngineerId;
	private String srHighLights;
	private String srComments;
	
	
	private String srRisk;
	
	private Date srStartDate;

	private Date srEndDate;

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
	private String srIssue;

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

}
