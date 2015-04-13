package com.trioPlus.supportCenter.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the booking_types database table.
 * 
 */
@Entity
@Table(name="booking_types")
@NamedQuery(name="BookingType.findAll", query="SELECT b FROM BookingType b")
public class BookingType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="type_id")
	private int typeId;

	@Column(name="type_name_ar")
	private String typeNameAr;

	@Column(name="type_name_en")
	private String typeNameEn;

//	//bi-directional many-to-one association to Booking
//	@OneToMany(mappedBy="bookingType")
//	private List<Booking> bookings;

	public BookingType() {
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

//	public List<Booking> getBookings() {
//		return this.bookings;
//	}
//
//	public void setBookings(List<Booking> bookings) {
//		this.bookings = bookings;
//	}

//	public Booking addBooking(Booking booking) {
//		getBookings().add(booking);
//		booking.setBookingType(this);
//
//		return booking;
//	}
//
//	public Booking removeBooking(Booking booking) {
//		getBookings().remove(booking);
//		booking.setBookingType(null);
//
//		return booking;
//	}

}