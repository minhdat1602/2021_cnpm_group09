package com.nlu.payload;

public class BookingPayload {
	String name;
	String email;
	String arrivalDate;
	String departureDate;
	int maxCapacity;
	String roomNumber;
	String note;
	String cardHolderName;
	String cardNumber;
	String expriedTime;

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpriedTime() {
		return expriedTime;
	}

	public void setExpriedTime(String expriedTime) {
		this.expriedTime = expriedTime;
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
				+ ", cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber + ", expriedTime=" + expriedTime
				+ "]";
	}

}
