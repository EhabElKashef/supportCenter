package com.trioPlus.supportCenter.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the stakeholders database table.
 * 
 */
@Entity
@Table(name="stakeholders")
@NamedQuery(name="Stakeholder.findAll", query="SELECT s FROM Stakeholder s")
public class Stakeholder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String stakeholder_name;

	//bi-directional many-to-many association to Project
	@ManyToMany(mappedBy="stakeholders")
	private List<Project> projects;

	public Stakeholder() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStakeholder_name() {
		return this.stakeholder_name;
	}

	public void setStakeholder_name(String stakeholder_name) {
		this.stakeholder_name = stakeholder_name;
	}

	public List<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}