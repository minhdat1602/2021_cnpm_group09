package com.nlu.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_t")
public class OrderEntity extends BaseEntity {
	String customerName;
	String email;
	String phomeNumber;
	String maxCapacity;
	String note;
	@ManyToOne
	@JoinColumn(name = "room_id")
	RoomEntity room;

	@ManyToOne
	@JoinColumn(name = "card_id")
	CardEntity card;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhomeNumber() {
		return phomeNumber;
	}

	public void setPhomeNumber(String phomeNumber) {
		this.phomeNumber = phomeNumber;
	}

	public String getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(String maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public RoomEntity getRoom() {
		return room;
	}

	public void setRoom(RoomEntity room) {
		this.room = room;
	}

	public CardEntity getCard() {
		return card;
	}

	public void setCard(CardEntity card) {
		this.card = card;
	}

}
