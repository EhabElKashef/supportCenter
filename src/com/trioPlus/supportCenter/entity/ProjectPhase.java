package com.trioPlus.supportCenter.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the project_phase database table.
 * 
 */
@Entity
@Table(name="project_phase")
@NamedQuery(name="ProjectPhase.findAll", query="SELECT p FROM ProjectPhase p")
public class ProjectPhase implements Serializable {
	private static final long serialVersionUID = 1L;

	
	 @Id  
	 @SequenceGenerator(name="userSeq", sequenceName = "MGM_PROMOTER_SEQ")
	 @GeneratedValue(generator = "userSeq")	
 
	private int id;

	@Column(name="phase_name")
	private String phaseName;

	public ProjectPhase() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhaseName() {
		return this.phaseName;
	}

	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}

}