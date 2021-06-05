package com.nlu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "booking")
public class BookingEntity extends BaseEntity {

	@Column
	private String code;
	
	@Column(name = "book_date")
	private Date bookdate;
	
	@Column(name = "start_date")
	private Date startdate;

	@Column(name = "end_date")
	private Date enddate;

	@Column(name = "notes")
	private String notes;

	@Column
	private int status;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "room_id")
	private RoomEntity room;

	@JsonManagedReference
	@OneToOne
	@JoinColumn(name = "customer_id")
	private CustomerEntity customer;

	public int getStatus() {
		return status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getBookdate() {
		return bookdate;
	}

	public void setBookdate(Date bookdate) {
		this.bookdate = bookdate;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public RoomEntity getRoom() {
		return room;
	}

	public void setRoom(RoomEntity room) {
		this.room = room;
	}

}
