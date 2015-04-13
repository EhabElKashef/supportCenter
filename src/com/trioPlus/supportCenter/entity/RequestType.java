package com.trioPlus.supportCenter.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the request_types database table.
 * 
 */
@Entity
@Table(name="request_types")
@NamedQuery(name="RequestType.findAll", query="SELECT r FROM RequestType r")
public class RequestType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="type_id")
	private int typeId;

	@Column(name="type_name_ar")
	private String typeNameAr;

	@Column(name="type_name_en")
	private String typeNameEn;

	public RequestType() {
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeNameAr() {
		return this.typeNameAr;
	}

	public void setTypeNameAr(String typeNameAr) {
		this.typeNameAr = typeNameAr;
	}

	public String getTypeNameEn() {
		return this.typeNameEn;
	}

	public void setTypeNameEn(String typeNameEn) {
		this.typeNameEn = typeNameEn;
	}

}