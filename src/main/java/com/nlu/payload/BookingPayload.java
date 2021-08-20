package com.nlu.payload;

public class BookingPayload {
	long roomId;
	String name;
	String email;
	String arrivalDate;
	String departureDate;
	int maxCapacity;
	String roomNumber;
	String note;
	String phomeNumber;
	String cmnd;

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public String getPhomeNumber() {
		return phomeNumber;
	}

	public void setPhomeNumber(String phomeNumber) {
		this.phomeNumber = phomeNumber;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "BookingPayload [name=" + name + ", email=" + email + ", arrivalDate=" + arrivalDate + ", departureDate="
				+ departureDate + ", maxCapacity=" + maxCapacity + ", roomNumber=" + roomNumber + ", note=" + note
				+ ", phoneNumber=" + phomeNumber + "]";
	}

}
