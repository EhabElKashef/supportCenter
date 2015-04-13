package com.trioPlus.supportCenter.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



public class Destination {

private int id;

private String destinationName;

private double destinationPeriduim;
private double currency;
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
public double getCurrency() {
	return currency;
}
public void setCurrency(double currency) {
	this.currency = currency;
}
@Override
public String toString() {
	return "Destination [id=" + id + ", destinationName=" + destinationName
			+ ", destinationPeriduim=" + destinationPeriduim + ", currency="
			+ currency + "]";
}
}
