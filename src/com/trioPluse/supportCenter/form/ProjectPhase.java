package com.trioPluse.supportCenter.form;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * The persistent class for the project_phase database table.
 * 
 */

public class ProjectPhase implements Serializable {
	private static final long serialVersionUID = 1L;

	
	 
	private int id;
   @NotEmpty
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