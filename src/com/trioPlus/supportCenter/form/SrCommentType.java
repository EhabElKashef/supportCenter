package com.trioPlus.supportCenter.form;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sr_comment_type database table.
 * 
 */
@Entity
@Table(name="sr_comment_type")
@NamedQuery(name="SrCommentType.findAll", query="SELECT s FROM SrCommentType s")
public class SrCommentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="type_name")
	private String typeName;

	public SrCommentType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}