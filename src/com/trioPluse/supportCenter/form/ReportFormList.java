package com.trioPluse.supportCenter.form;

import com.trioPlus.supportCenter.entity.User;

public class ReportFormList {
	private int id;
	private com.trioPlus.supportCenter.entity.Project project;
	private User srEngineer;
	private String srHighLights;
	private String srComments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public com.trioPlus.supportCenter.entity.Project getProject() {
		return project;
	}
	public void setProject(com.trioPlus.supportCenter.entity.Project project) {
		this.project = project;
	}
	public User getSrEngineer() {
		return srEngineer;
	}
	public void setSrEngineer(User srEngineer) {
		this.srEngineer = srEngineer;
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
	
}
