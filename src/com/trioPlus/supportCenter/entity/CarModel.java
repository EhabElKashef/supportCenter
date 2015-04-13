package com.trioPlus.supportCenter.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the car_model database table.
 * 
 */
@Entity
@Table(name="car_model")
@NamedQuery(name="CarModel.findAll", query="SELECT c FROM CarModel c")
public class CarModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="model_id")
	private int modelId;

	@Column(name="model_name_arl")
	private String modelNameArl;

	@Column(name="model_name_en")
	private String modelNameEn;

	public CarModel() {
	}

	public int getModelId() {
		return this.modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public String getModelNameArl() {
		return this.modelNameArl;
	}

	public void setModelNameArl(String modelNameArl) {
		this.modelNameArl = modelNameArl;
	}

	public String getModelNameEn() {
		return this.modelNameEn;
	}

	public void setModelNameEn(String modelNameEn) {
		this.modelNameEn = modelNameEn;
	}

}