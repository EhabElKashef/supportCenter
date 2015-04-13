package com.trioPlus.supportCenter.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_verification database table.
 * 
 */
@Entity
@Table(name="user_verification")
@NamedQuery(name="UserVerification.findAll", query="SELECT u FROM UserVerification u")
public class UserVerification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="generation_key_time")
	private Date generationKeyTime;

	private String msisdn;

	@Column(name="verification_key")
	private String verificationKey;

	public UserVerification() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getGenerationKeyTime() {
		return this.generationKeyTime;
	}

	public void setGenerationKeyTime(Date generationKeyTime) {
		this.generationKeyTime = generationKeyTime;
	}

	public String getMsisdn() {
		return this.msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getVerificationKey() {
		return this.verificationKey;
	}

	public void setVerificationKey(String verificationKey) {
		this.verificationKey = verificationKey;
	}

}