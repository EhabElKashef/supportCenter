package com.trioPlus.supportCenter.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user_cars database table.
 * 
 */
@Entity
@Table(name="user_cars")
@NamedQuery(name="UserCar.findAll", query="SELECT u FROM UserCar u")
public class UserCar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="car_id")
	private int carId;

	@Column(name="chase_number")
	private String chaseNumber;

	private String color;

	@Column(name="model_id")
	private int modelId;

	@Column(name="plate_number")
	private String plateNumber;

	@Column(name="type_id")
	private int typeId;

	private int year;

	//bi-directional many-to-one association to Booking
//	@OneToMany(mappedBy="userCar")
//	private List<Booking> bookings;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public UserCar() {
	}

	public int getCarId() {
		return this.carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getChaseNumber() {
		return this.chaseNumber;
	}

	public void setChaseNumber(String chaseNumber) {
		this.chaseNumber = chaseNumber;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getModelId() {
		return this.modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public String getPlateNumber() {
		return this.plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

//	public List<Booking> getBookings() {
//		return this.bookings;
//	}
//
//	public void setBookings(List<Booking> bookings) {
//		this.bookings = bookings;
//	}

//	public Booking addBooking(Booking booking) {
//		getBookings().add(booking);
//		booking.setUserCar(this);
//
//		return booking;
//	}
//
//	public Booking removeBooking(Booking booking) {
//		getBookings().remove(booking);
//		booking.setUserCar(null);
//
//		return booking;
//	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}