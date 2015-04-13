package com.trioPluse.supportCenter.form;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the system_cost database table.
 * 
 */
@Entity
@Table(name="system_cost")
@NamedQuery(name="SystemCost.findAll", query="SELECT s FROM SystemCost s")
public class SystemCost implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="cost_name")
	private String costName;

	@Column(name="paid_interval")
	private int paidInterval;

	private String system_Costcol;

	private int costType;

	private BigDecimal costValue;

	public SystemCost() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCostName() {
		return this.costName;
	}

	public void setCostName(String costName) {
		this.costName = costName;
	}

	public int getPaidInterval() {
		return this.paidInterval;
	}

	public void setPaidInterval(int paidInterval) {
		this.paidInterval = paidInterval;
	}

	public String getSystem_Costcol() {
		return this.system_Costcol;
	}

	public void setSystem_Costcol(String system_Costcol) {
		this.system_Costcol = system_Costcol;
	}

	public int getCostType() {
		return costType;
	}

	public void setCostType(int costType) {
		this.costType = costType;
	}

	public BigDecimal getCostValue() {
		return costValue;
	}

	public void setCostValue(BigDecimal costValue) {
		this.costValue = costValue;
	}

	
}