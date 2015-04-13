package com.trioPlus.supportCenter.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the request database table.
 * 
 */
@Entity
@NamedQuery(name="Request.findAll", query="SELECT r FROM Request r")
public class Request implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="request_id")
	private int requestId;

	@Column(name="car_id")
	private int carId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="confirmation_time")
	private Date confirmationTime;

	private String desc;

	private String reason;

	@Temporal(TemporalType.DATE)
	@Column(name="request_date")
	private Date requestDate;

	@Column(name="request_time")
	private Time requestTime;

	@Column(name="request_type_id")
	private int requestTypeId;

	private String status;

	public Request() {
	}

	public int getRequestId() {
		return this.requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getCarId() {
		return this.carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public Date getConfirmationTime() {
		return this.confirmationTime;
	}

	public void setConfirmationTime(Date confirmationTime) {
		this.confirmationTime = confirmationTime;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Time getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(Time requestTime) {
		this.requestTime = requestTime;
	}

	public int getRequestTypeId() {
		return this.requestTypeId;
	}

	public void setRequestTypeId(int requestTypeId) {
		this.requestTypeId = requestTypeId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}