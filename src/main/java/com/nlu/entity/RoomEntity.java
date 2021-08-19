package com.nlu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "rooms")
public class RoomEntity extends BaseEntity {

	@Column(unique = true)
	private String number;

	@Column
	private int active;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "room_type_id")
	private RoomTypeEntity type;

	@JsonBackReference
	@OneToMany(mappedBy = "room", targetEntity = BookingEntity.class)
	private List<BookingEntity> bookings;

	@OneToMany(mappedBy = "room")
	private List<OrderEntity> orders;

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public RoomTypeEntity getType() {
		return type;
	}

	public void setType(RoomTypeEntity type) {
		this.type = type;
	}

	public List<BookingEntity> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingEntity> bookings) {
		this.bookings = bookings;
	}

}
