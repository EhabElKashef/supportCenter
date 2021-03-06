package com.trioPlus.supportCenter.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="travel_cost")

public class TravelCost {
	@Id	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int user_id;
	private String destinationId;
	private Date startDate;
	private Date endDate;
	private double flightCost;
	private double accomodation;
	private double currency;
	//private double perduim;
	private double total;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getFlightCost() {
		return flightCost;
	}
	public void setFlightCost(double flightCost) {
		this.flightCost = flightCost;
	}
	public double getAccomodation() {
		return accomodation;
	}
	public void setAccomodation(double accomodation) {
		this.accomodation = accomodation;
	}
	public double getCurrency() {
		return currency;
	}
	public void setCurrency(double currency) {
		this.currency = currency;
	}
//	public double getPerduim() {
//		return perduim;
//	}
//	public void setPerduim(double perduim) {
//		this.perduim = perduim;
//	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
}
