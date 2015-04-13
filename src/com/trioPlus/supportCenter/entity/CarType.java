package com.trioPlus.supportCenter.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the car_type database table.
 * 
 */
@Entity
@Table(name="car_type")
@NamedQuery(name="CarType.findAll", query="SELECT c FROM CarType c")
public class CarType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="type_id")
	private int typeId;

	@Column(name="type_name_ar")
	private String typeNameAr;

	@Column(name="type_name_en")
	private String typeNameEn;

	public CarType() {
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