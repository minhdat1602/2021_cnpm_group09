package com.nlu.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "customer")
public class CustomerEntity extends BaseEntity {

	private String fullname;

	private String email;

	private String address;

	public String getFullname() {
		return fullname;
	}

	@JsonBackReference
	@OneToOne(mappedBy = "customer", targetEntity = BookingEntity.class)
	private BookingEntity booking;

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
