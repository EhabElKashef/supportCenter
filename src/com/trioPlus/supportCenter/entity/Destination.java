package com.trioPlus.supportCenter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="travel_destination")

public class Destination {
@Id	
private int id;
@Column(name="destination_name")
private String destinationName;
@Column(name="destination_periduim")
private double destinationPeriduim;
@Column(name="currency_name")
private String currencyName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDestinationName() {
	return destinationName;
}
public void setDestinationName(String destinationName) {
	this.destinationName = destinationName;
}
public double getDestinationPeriduim() {
	return destinationPeriduim;
}
public void setDestinationPeriduim(double destinationPeriduim) {
	this.destinationPeriduim = destinationPeriduim;
}
public String getCurrencyName() {
	return currencyName;
}
public void setCurrencyName(String currencyName) {
	this.currencyName = currencyName;
}
}
