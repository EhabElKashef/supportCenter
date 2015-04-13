package com.trioPlus.supportCenter.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;

	private String email;

	@Column(name="loyalty_id")
	private int loyaltyId;

	private String msisdn;

	private String name;
	private String password;

	//bi-directional many-to-one association to UserCar
	@OneToMany(mappedBy="user")
	private List<UserCar> userCars;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLoyaltyId() {
		return this.loyaltyId;
	}

	public void setLoyaltyId(int loyaltyId) {
		this.loyaltyId = loyaltyId;
	}

	public String getMsisdn() {
		return this.msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserCar> getUserCars() {
		return this.userCars;
	}

	public void setUserCars(List<UserCar> userCars) {
		this.userCars = userCars;
	}

	public UserCar addUserCar(UserCar userCar) {
		getUserCars().add(userCar);
		userCar.setUser(this);

		return userCar;
	}

	public UserCar removeUserCar(UserCar userCar) {
		getUserCars().remove(userCar);
		userCar.setUser(null);

		return userCar;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}