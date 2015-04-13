package com.trioPlus.supportCenter.form;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sr_scope database table.
 * 
 */
@Entity
@Table(name="sr_scope")
@NamedQuery(name="SrScope.findAll", query="SELECT s FROM SrScope s")
public class SrScope implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String points;

	@Column(name="project_id")
	private int projectId;

	public SrScope() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPoints() {
		return this.points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

}